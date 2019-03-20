package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.enums.PaymentOption;

public class Order {
	private List<Coffee> products;
	private PaymentOption option;
	private boolean applyDiscount;
	
	public Order() {
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Coffee c) {
		this.products.add(c);
	}
	
	public void removeProduct(Coffee c) {
		this.products.remove(c);
	}
	
	public void removeProduct(int index) {
		this.products.remove(index);
	}
	
	public void displayOrderDetails() {
		for( Coffee c : this.products) {
			System.out.println(c.getBeverageName() + " " + c.getType() + " " + c.getPrice());
		}
		System.out.println("---------------------------------------------");
		System.out.println("Discount: " + this.applyDiscount);
		System.out.println("Payment option: " + this.option);
		System.out.println("Price: " + this.getOrderPrice());
	}
	
	public double getOrderPrice() {
		double totalPrice = 0;
		for( Coffee coffee : this.products) {
			totalPrice += coffee.getPrice();
		}
		//TODO: apply discount
		return totalPrice;
	}
	
	public void setApplyDiscount(boolean value) {
		this.applyDiscount = value;
	}
	
	public void setPaymentOption(PaymentOption paymentOption) {
		this.option = paymentOption;
	}
}
