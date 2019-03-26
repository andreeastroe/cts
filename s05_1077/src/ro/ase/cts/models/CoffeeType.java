package ro.ase.cts.models;

public enum CoffeeType {
	ETIOPIA("ETIOPIA"),
	ARABICA("ARABICA"),
	BRAZIL("BRAZIL"),
	GUATEMALA("GUATEMALA");
	
	private String coffeeName;
	
	private CoffeeType(String name) {
		this.coffeeName = name();
	}
}
