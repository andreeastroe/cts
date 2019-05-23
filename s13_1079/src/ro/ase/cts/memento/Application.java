package ro.ase.cts.memento;

public class Application {

	public static void main(String[] args) {
		Contract contract = new Contract("Costachescu", "12/12/2019", 100);
		
		//manager of memento
		CareTaker manager = new CareTaker();
		
		//save version to memento
		Memento memento = contract.savetoMemento();
		manager.addMemento(memento);
		
		//change the state
		contract.setNoPers(110);
		contract.setNoPers(120);
		manager.addMemento(contract.savetoMemento());
		
		contract.setNoPers(130);
		System.out.println(contract.toString());
		
		//restore current state of object from the caretaker
		contract.restoreFromMemento(manager.getMemento(0));
		System.out.println(contract.toString());

	}

}
