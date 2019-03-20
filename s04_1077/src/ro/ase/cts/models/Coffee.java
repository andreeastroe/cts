package ro.ase.cts.models;

import ro.ase.cts.enums.CoffeeType;

public class Coffee {
	private String beverageName;
	private CoffeeType type;
	private double price;
	
	public Coffee() {}

	public Coffee(String beverageName, CoffeeType type, double price) {
		this.beverageName = beverageName;
		this.type = type;
		this.price = price;
	}

	public String getBeverageName() {
		return beverageName;
	}

	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}

	public CoffeeType getType() {
		return type;
	}

	public void setType(CoffeeType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
