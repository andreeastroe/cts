package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.Observer;

public abstract class Observable {

	private ArrayList<IObserver> obsList = new ArrayList<>();
	
	public void addObserver(IObserver observer) {
		obsList.add(observer);
	}
	
	public void removeObserver(IObserver observer) {
		obsList.remove(observer);
	}
	
	public void notifyAllObservers(String message) {
		for(IObserver observer:obsList) {
			observer.react(createMessage());
			}
	}
	
	abstract String createMessage();
}
