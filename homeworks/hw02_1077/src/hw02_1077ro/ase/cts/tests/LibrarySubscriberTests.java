package hw02_1077ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import hw02_1077ro.ase.cts.exceptions.InvalidNumberOfBorrowedBooksException;
import hw02_1077ro.ase.cts.exceptions.NoBooksBorrowedException;
import hw02_1077ro.ase.cts.models.LibrarySubscriber;

public class LibrarySubscriberTests {

	private LibrarySubscriber librarySubscriber;
	
	@Before
	public void setUp() {
		librarySubscriber = new LibrarySubscriber("John Doe", "p@ssw0rd");
	}
	
	@Test
	public void testGetMaximumNumberForMultipleBooksBorrowed() {
		librarySubscriber.setBorrowedBooksAtOnce(new ArrayList<Integer>(Arrays.asList(2, 1, 3, 2)));
		int expectedValue = 3;
		try {
			assertEquals(expectedValue, this.librarySubscriber.getMaximumNumberOfBorrowedBooks());
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetMaximumNumberForOneRecordOfBooksBorrowed() {
		librarySubscriber.setBorrowedBooksAtOnce(new ArrayList<Integer>(Arrays.asList(2)));
		int expectedValue =2;
		try {
			assertEquals(expectedValue, this.librarySubscriber.getMaximumNumberOfBorrowedBooks());
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetMaximumNumberForNoBooksBorrowed() {
		librarySubscriber.setBorrowedBooksAtOnce(new ArrayList<Integer>());
		int expectedValue = 0;
		try {
			assertEquals(expectedValue, this.librarySubscriber.getMaximumNumberOfBorrowedBooks());
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetMaximumNumberForNegativeBooksBorrowed() {
		librarySubscriber.setBorrowedBooksAtOnce(new ArrayList<Integer>(Arrays.asList(2, 1, -3, 2)));
		try {
			this.librarySubscriber.getMaximumNumberOfBorrowedBooks();
			fail("Should throw NoBooksBorrowedException");
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		} catch (Exception e) {
			assertTrue( "Expected InvalidNumberOfBorrowedBooksException but instead got " + e.getClass(), false);
		}
	}

	@Test
	public void testGetMaximumNumberForNullBooksBorrowed() {
		librarySubscriber.setBorrowedBooksAtOnce(null);
		try {
			this.librarySubscriber.getMaximumNumberOfBorrowedBooks();
			fail("Should throw NoBooksBorrowedException");
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		} catch (Exception e) {
			assertTrue( "Expected NoBooksBorrowedException but instead got " + e.getClass(), false);
		}
	}
	
	@Test
	public void testGetMaximumNumberForMaxIntBooksBorrowed() {
		librarySubscriber.setBorrowedBooksAtOnce(new ArrayList<Integer>(Arrays.asList(Integer.MAX_VALUE)));
		try {
			this.librarySubscriber.getMaximumNumberOfBorrowedBooks();
			fail("Should throw InvalidNumberOfBorrowedBooksException");
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		} catch (Exception e) {
			assertTrue( "Expected InvalidNumberOfBorrowedBooksException but instead got " + e.getClass(), false);
		}
	}
	
	@Test
	public void testGetMaximumNumberForShallowCopy() {
		ArrayList<Integer> mockValuesArrayList = new ArrayList<Integer>(Arrays.asList(4,2,3,5,1,2,3));
		librarySubscriber.setBorrowedBooksAtOnce(mockValuesArrayList);
			try {
				mockValuesArrayList.set(3, 1);				
				int expectedValue = 5;
				assertEquals(expectedValue, this.librarySubscriber.getMaximumNumberOfBorrowedBooks());
			} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetMaximumNumberForLoyalSubcriber() {
		ArrayList<Integer> mockValuesArrayList = new ArrayList<Integer>((int)9e7);
		for(int i =0; i<mockValuesArrayList.size();i++) {
			Random random = new Random();
			mockValuesArrayList.add(random.nextInt(6));
		}
		librarySubscriber.setBorrowedBooksAtOnce(mockValuesArrayList);
		try {
			long startTime = System.currentTimeMillis();
			this.librarySubscriber.getMaximumNumberOfBorrowedBooks();
			long endTime = System.currentTimeMillis();
			if( (endTime-startTime) > 100 )
				assertTrue("Took too long", false);
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetMaximumNumberCrossCheck() {
		librarySubscriber.setBorrowedBooksAtOnce(new ArrayList<Integer>(Arrays.asList(2, 1, 3, 2)));
		int expectedValue = Collections.max(librarySubscriber.getBorrowedBooksAtOnce());
		try {
			assertEquals(expectedValue, this.librarySubscriber.getMaximumNumberOfBorrowedBooks());
		} catch (NoBooksBorrowedException | InvalidNumberOfBorrowedBooksException e) {
			e.printStackTrace();
		}
	}
	
	
}



