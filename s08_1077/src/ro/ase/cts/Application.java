package ro.ase.cts;

import java.sql.Connection;

import ro.ase.cts.exceptions.DatabaseException;
import ro.ase.cts.helpers.UserBuilder;
import ro.ase.cts.models.DatabaseConnection;
import ro.ase.cts.models.User;

public class Application {

	public static void main(String[] args) {

		User user1 = new UserBuilder("John Doe", "test@test.com", "p@ssw0rd")
				.withOptionalCity("Bucharest")
				.withOptionalAddress("Calea Dorobanti")
				.withOptionalAge(23)
				.withOptionalPasswordExpired(false)
				.build();
		System.out.println(user1.getCompleteName() + ", " + user1.getAddress() + ", " + user1.getCity());
		
		User user2 = new UserBuilder("Jane Doe", "jane.doe@test.com", "p@ssw0rd")
				.withOptionalCity("Timisoara")
				.withOptionalAge(22)
				.withOptionalPasswordExpired(false)
				.build();
		System.out.println(user1.getCompleteName() + ", " + user1.getAddress() + ", " + user1.getCity());
		
		DatabaseConnection connection = DatabaseConnection.getInstance();
		try {
			connection.connect();
			connection.addUser(user1);
			connection.printUsers();
			DatabaseConnection connection1 = DatabaseConnection.getInstance();
			connection1.addUser(user2);
			connection1.printUsers();
		} catch (DatabaseException e) {
			e.printStackTrace();
		}
	}

	
	
}
