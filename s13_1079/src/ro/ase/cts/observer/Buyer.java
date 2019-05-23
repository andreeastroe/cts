package ro.ase.cts.observer;

public class Buyer implements IObserver{

	private String name;
	
	public Buyer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void react(String message) {
		System.out.println("Buyer " +  this.name + " was informed");
		System.out.println(message);
		
	}

}
