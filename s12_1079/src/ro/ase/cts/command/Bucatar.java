package ro.ase.cts.command;

public class Bucatar {
	//executant
	
	private String name;

	public Bucatar(String name) {
		super();
		this.name = name;
	}
	
	
	
	//metode specializate pentru fiecare tip de comanda concreta
	public void gatestePaste(String tipPaste, String tipBranza) {
		System.out.println("Bucatar " + this.name + " a gatit paste " + tipPaste + " cu " + tipBranza);
	}
	
	public void gatestePizza(String tipPizza) {
		System.out.println("Bucatar " + this.name + " a gatit pizza " + tipPizza);
	}
}
