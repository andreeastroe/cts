package ro.ase.cts.helpers;

import ro.ase.cts.models.User;

public class UserBuilder implements GenericBuilder<User>{

	private String completeName;
	private String email;
	private String password;
	private String city;
	private String address;
	private String telephone;
	private int age;
	private boolean isPasswordExpired;
	
	@Override
	public User build() {
		User user = new User();
		user.setCompleteName(this.completeName);
		user.setEmail(email);
		user.setPassword(this.password);
		user.setCity(this.city);
		user.setAddress(this.address);
		user.setTelephone(this.telephone);
		user.setAge(this.age);
		user.setPasswordExpired(this.isPasswordExpired);
		return user;
	}

	public UserBuilder withOptionalCity(String city) {
		this.city = city;
		return this;
	}
	
	public UserBuilder withOptionalTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}
	
	public UserBuilder withOptionalAddress(String address) {
		this.address = address;
		return this;
	}
	
	public UserBuilder withOptionalAge(int age) {
		this.age = age;
		return this;
	}
	
	public UserBuilder withOptionalPasswordExpired(boolean isPasswordExpired) {
		this.isPasswordExpired = isPasswordExpired;
		return this;
	}
	
	public UserBuilder(String name, String email, String password) {
		this.completeName = name;
		this.email = email;
		this.password = password;
	}
}
