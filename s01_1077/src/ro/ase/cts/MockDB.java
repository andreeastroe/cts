package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.models.Admin;
import ro.ase.cts.models.Supplier;
import ro.ase.cts.models.User;

public class MockDB {

	public static List<User> users = null;
	
	static {
		users = new ArrayList<>();
		users.add(new Supplier("John Doe", "john.doe@email.com", "P@ssw0rd", "SC JOHN SRL"));
		users.add(new Admin("Jane Doe", "jane.doe@email.com", "@dmin", "READ, WRITE"));
	}
}
