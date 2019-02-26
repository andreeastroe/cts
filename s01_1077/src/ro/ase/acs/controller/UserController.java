package ro.ase.acs.controller;

import java.util.Optional;

import ro.acs.cts.exceptions.InvalidCredentialsException;
import ro.ase.cts.MockDB;
import ro.ase.cts.models.User;
import ro.ase.cts.service.UserService;

public class UserController implements UserService {

	private User loggedUser;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void authenticate(String username, String password) throws InvalidCredentialsException {
		Optional<User> userOptional = MockDB.users.stream().filter(user -> user.getEmail().equals(username) && user.getPassword().equals(password)).findFirst();
		if(userOptional.isPresent()) {
			this.loggedUser=userOptional.get();
			System.out.println("Logged in successfully!");
		}
		else {
			throw new InvalidCredentialsException("Invalid Credentials!");
		}
	}

	
	public User getLoggedUser() {
		return this.loggedUser;
	}
}
