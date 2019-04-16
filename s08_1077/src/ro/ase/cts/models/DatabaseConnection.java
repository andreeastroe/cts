package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.exceptions.DatabaseException;

public class DatabaseConnection {

	// possible problems with multithreading and serialization 
	
	private static DatabaseConnection dbInstance;
	private boolean isConnectionOpen;
	private List<User> users;
	
	private DatabaseConnection(){
		this.users = new ArrayList<>();
	};
	
	public static DatabaseConnection getInstance() {
		if(dbInstance == null)
			dbInstance = new DatabaseConnection();
		return dbInstance;
	}
	
	public void connect() throws DatabaseException {
		if(this.isConnectionOpen)
			throw new DatabaseException("Connection already open!");
		this.isConnectionOpen = true;
		System.out.println("Successfully connected to the database...");
	}
	
	public void close() throws DatabaseException {
		if(!this.isConnectionOpen)
			throw new DatabaseException("Connection already closed!");
		this.isConnectionOpen = false;
		System.out.println("Successfully closed connection to the database...");
	}
	
	public void addUser(User user) throws DatabaseException {
		if(!this.isConnectionOpen)
			throw new DatabaseException("Connection to database should be open!");
		this.users.add(user);
	}
	
	public void printUsers() {
		for(User user : this.users) {
			System.out.println(user.getCompleteName() + " " + user.getEmail() + " " + user.getCity());
		}
	}
}
