package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Coffee> products;
	private double orderValue;
	private boolean applyDiscount;
	
	public Order() {
		this.products = new ArrayList<Coffee>();
	}
	
	
	
	public void addProduct(Coffee c) {
		this.products.add(c);
	}
	
	public void removeProduct(Coffee c) {
		this.products.remove(c);
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for(Coffee coffee : this.products) {
			totalPrice += coffee.getPrice();
		}
		return totalPrice;
	}
	
	public String printOrder() {
		StringBuilder builder = new StringBuilder();
		for(Coffee coffee : this. products) {
			builder.append(coffee.getBeverageName() + " " + coffee.getCoffeeType() + " " + coffee.getPrice() + "\n");
		}
		builder.append("Total price: " + this.getTotalPrice());
			return builder.toString();
	}
}
