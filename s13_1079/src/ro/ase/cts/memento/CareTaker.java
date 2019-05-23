package ro.ase.cts.memento;

import java.util.ArrayList;

public class CareTaker {

	private ArrayList<Memento> mementoList = new ArrayList<>();
	
	public void addMemento(Memento memento) {
		this.mementoList.add(memento);
	}
	
	public Memento getMemento(int i) {
		return this.mementoList.get(i);
	}
}
