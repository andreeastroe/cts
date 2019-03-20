package ro.ase.cts;

import ro.ase.cts.enums.CoffeeType;
import ro.ase.cts.enums.PaymentOption;
import ro.ase.cts.models.Coffee;
import ro.ase.cts.models.Order;

public class Application {

	public static void main(String[] args) {
		Coffee c1 = new Coffee("Cappuccino", CoffeeType.ETIOPIA, 16.5);
		Coffee c2 = new Coffee("Latte", CoffeeType.ARABICA, 13);
		
		Order order = new Order();
		order.addProduct(c1);
		order.addProduct(c2);
		order.setPaymentOption(PaymentOption.CRYPTO);
		order.displayOrderDetails();
	}

}
