package ro.ase.cts.models;

public class Supplier extends User{

	private String companyName;
	
	public Supplier() {
		super();
	}
	
	public Supplier(String fullName, String email, String password, String companyName) {
		super(fullName, email, password);
		this.companyName=companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
}
