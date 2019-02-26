package ro.ase.cts.models;

public class Admin extends User{

	private String authorities;

	public Admin() {
		super();
	}
	
	public Admin(String fullName, String email, String password, String authorities) {
		super(fullName, email, password);
		this.authorities=authorities;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	
	
}
