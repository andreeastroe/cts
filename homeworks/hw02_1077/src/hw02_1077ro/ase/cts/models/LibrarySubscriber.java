package hw02_1077ro.ase.cts.models;

import java.util.ArrayList;

import hw02_1077ro.ase.cts.exceptions.InvalidNumberOfBorrowedBooksException;
import hw02_1077ro.ase.cts.exceptions.NoBooksBorrowedException;

public class LibrarySubscriber {

	private String name;
	private String subscription;
	private ArrayList<Integer> borrowedBooksAtOnce;
	
	public static final int MAXIMUM_NUMBER_BOOKS_ALLOWED = 5;
	
	public LibrarySubscriber() {}
	
	public LibrarySubscriber(String name, String subscription) {
		super();
		this.name = name;
		this.subscription = subscription;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubscription() {
		return subscription;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public ArrayList<Integer> getBorrowedBooksAtOnce() {
		return borrowedBooksAtOnce;
	}
	public void setBorrowedBooksAtOnce(ArrayList<Integer> borrowedBooksAtOnce) {
		if(borrowedBooksAtOnce != null)
			this.borrowedBooksAtOnce = new ArrayList<Integer>(borrowedBooksAtOnce);
		else {
			this.borrowedBooksAtOnce = null;
		}
	}
	
	public int getMaximumNumberOfBorrowedBooks() throws NoBooksBorrowedException, InvalidNumberOfBorrowedBooksException {
		if(this.borrowedBooksAtOnce == null) {
			throw new NoBooksBorrowedException();
		}
		
		
		int maximumNumberOfBorrowedBooks = 0;
		for ( Integer number : borrowedBooksAtOnce) {
			if(number.intValue()<0 || number.intValue() > MAXIMUM_NUMBER_BOOKS_ALLOWED) {
				throw new InvalidNumberOfBorrowedBooksException();
			}
			if(number.compareTo(maximumNumberOfBorrowedBooks)>0)
				maximumNumberOfBorrowedBooks = number.intValue();
		}
		return maximumNumberOfBorrowedBooks;
	}
}
