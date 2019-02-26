package ro.ase.cts;

import ro.acs.cts.exceptions.InvalidCredentialsException;
import ro.ase.acs.controller.UserController;
import ro.ase.cts.models.Admin;
import ro.ase.cts.models.Supplier;

public class Application {

	public static void main(String[] args) {
		System.out.println("Everything is working!");
		
		Supplier supplier = new Supplier("John Doe", "john.doe@email.com", "P@ssw0rd", "SC JOHN SRL");
		System.out.println(supplier.getCompanyName());
		System.out.println(supplier.getEmail());
		System.out.println(supplier.getFullName());
		
		Admin admin = new Admin("Jane Doe", "jane.doe@email.com", "@dmin", "READ, WRITE");
		System.out.println(admin.getAuthorities());
		System.out.println(admin.getFullName());
		System.out.println(admin.getPassword());
		
		UserController controller = new UserController();
		try {
			//controller.authenticate("dummyUser", "password");
			controller.authenticate(admin.getEmail(), admin.getPassword());
		} catch (InvalidCredentialsException e) {
			System.out.println(e.getMessage());
		}
		
		if(controller.getLoggedUser().getClass().equals(Admin.class)) {
			System.out.println("Implement logic for admin");
		}
		else {
			System.out.println("Implement logic for supplier");
		}
	}
}
