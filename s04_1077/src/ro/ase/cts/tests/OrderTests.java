package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.utils.CoffeeDB;

public class OrderTests {
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("Connecting to database...");
		try {
			CoffeeDB.connect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("Closing database connection...");
		CoffeeDB.close();
	}
	
	@Test
	public void testDatabaseSet() {
		assertEquals("Cappuccino", CoffeeDB.queryDBByIndex(1));
	}
	
	@Test
	public void testCrossCheck() {
		assertEquals(CoffeeDB.queryDBByIndex(1), CoffeeDB.queryDBByValue("Cappuccino"));
	}
}
