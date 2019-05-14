package ro.ase.cts.models;

public class Latte extends Coffee {

	public Latte() {
		this.setDescription("Latte");
	}
	
	@Override
	public double getPrice() {
		return 10;
	}

}
