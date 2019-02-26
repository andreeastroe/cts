package ro.ase.cts.models;

public abstract class User {
	
	private String fullName;
	private String email;
	private String password;
	private Boolean isLoggedIn;
	
	User(){}
	
	User(String fullName, String email, String password){
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.isLoggedIn = false;
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsLoggedIn() {
		return isLoggedIn;
	}

	public void setIsLoggedIn(Boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
	
}
