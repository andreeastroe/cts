package ro.ase.cts.models;

public class FlatWhite extends Coffee {

	public FlatWhite() {
		this.setDescription("Flat White");
	}
	
	@Override
	public double getPrice() {
		return 12;
	}

}
