package ro.ase.cts.service;

import ro.acs.cts.exceptions.InvalidCredentialsException;

public interface UserService {

	void authenticate(String username, String password) throws InvalidCredentialsException;
}
