package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.cts.models.Coffee;
import ro.ase.cts.models.CoffeeType;
import ro.ase.cts.models.Order;
import ro.ase.cts.utils.CoffeeDB;

public class OrderTests {

	private Order order;
	
	@BeforeClass
	public static void beforeAll() {
		try {
			CoffeeDB.connectDB("admin", "password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Before
	public void setUp() {
		order = new Order();
	}
	
	@AfterClass
	public static void afterAll() {
		CoffeeDB.closeDB("admin", "password");
	}
	
	@Test
	public void testPrintOrderSingleProduct() {
		Coffee c1 = new Coffee("Latte", CoffeeType.BRAZIL, 12.3);
		this.order.addProduct(c1);
		String value = String.join("\n", c1.getBeverageName() + " " + c1.getCoffeeType() + " " + c1.getPrice() + "\nTotal price: 12.3");
		
		assertEquals(value, this.order.printOrder());
	}
	
	@Test
	public void testPrintOrderTwoProducts() {
		Coffee c1 = new Coffee("Latte", CoffeeType.BRAZIL, 12.3);
		Coffee c2 = new Coffee("Frappe", CoffeeType.ETIOPIA, 16.0);
		this.order.addProduct(c1);
		this.order.addProduct(c2);
		String value = String.format("%s\n%s\n%s", c1.getBeverageName() + " " + c1.getCoffeeType() + " " + c1.getPrice(), 
				c2.getBeverageName() + " " + c2.getCoffeeType() + " " + c2.getPrice(), "Total price: " + this.order.getTotalPrice());
		assertEquals(value, this.order.printOrder());
	}
	
	@Test
	public void testPrintOrderMultipleProducts() {
		
		for(Coffee c : CoffeeDB.coffeeNames) {
			this.order.addProduct(c);
		}
		Optional<String> productsOptional = CoffeeDB.coffeeNames.stream().map( product -> {
			String value = product.getBeverageName() + " " + product.getCoffeeType() + " " + product.getPrice() + "\n";
			return value;
		}).reduce((finalValue, currentValue) -> {
			finalValue += currentValue;
			return finalValue;
		});
		
		Optional<Double> totalPrice = CoffeeDB.coffeeNames.stream().map(product -> product.getPrice()).reduce((total, current)->{
			total+=current;
			return total;
		});
		
		if(productsOptional.isPresent() && totalPrice.isPresent()) {
			String finalOrder = productsOptional.get() + "Total price: " + totalPrice.get();
			assertEquals(finalOrder, this.order.printOrder());
		}
		
	
	}
	
}
