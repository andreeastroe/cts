package andreea.cts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import andreea.cts.exceptions.InsufficientFundsException;
import andreea.cts.exceptions.InsufficientOrderInformationException;
import andreea.cts.exceptions.InvalidProductCategoryException;
import andreea.cts.models.Order;
import andreea.cts.models.ProductCategory;
import andreea.cts.utilities.OrderUtilities;

public class OrderTest {

	@Test
	public void testOrderForProductsBundle() {
		Order order = new Order(new int[] {1,2,3}, new ProductCategory[] {ProductCategory.BOOKS, ProductCategory.FOODSTUFFS, ProductCategory.PHARMACEUTCAL});
		try {
			assertEquals(15.8946, OrderUtilities.registerOrder(order, 100), 0.0001);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForFoodstuffs() {
		Order order = new Order(new int[] {1,1,1}, new ProductCategory[] {ProductCategory.FOODSTUFFS, ProductCategory.FOODSTUFFS, ProductCategory.FOODSTUFFS});
		try {
			assertEquals(4.5126, OrderUtilities.registerOrder(order, 100), 0.0001);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForBooks() {
		Order order = new Order(new int[] {1,1,1}, new ProductCategory[] {ProductCategory.BOOKS, ProductCategory.BOOKS, ProductCategory.BOOKS});
		try {
			assertEquals(13.544999999999998, OrderUtilities.registerOrder(order, 100), 0.0001);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForClothing() {
		Order order = new Order(new int[] {1,1,1}, new ProductCategory[] {ProductCategory.CLOTHING_AND_HOUSEHOLD_LINEN, ProductCategory.CLOTHING_AND_HOUSEHOLD_LINEN, ProductCategory.CLOTHING_AND_HOUSEHOLD_LINEN});
		try {
			assertEquals(25.8825, OrderUtilities.registerOrder(order, 100), 0.0001);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForShoes() {
		Order order = new Order(new int[] {1,1,1}, new ProductCategory[] {ProductCategory.SHOES_AND_LEATHER_GOODS, ProductCategory.SHOES_AND_LEATHER_GOODS, ProductCategory.SHOES_AND_LEATHER_GOODS});
		try {
			assertEquals(21.027299999999997, OrderUtilities.registerOrder(order, 100), 0.0001);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	

	@Test
	public void testOrderForPharmaceuticals() {
		Order order = new Order(new int[] {1,1,1}, new ProductCategory[] {ProductCategory.PHARMACEUTCAL, ProductCategory.PHARMACEUTCAL, ProductCategory.PHARMACEUTCAL});
		try {
			assertEquals(8.371200000000002, OrderUtilities.registerOrder(order, 100), 0.0001);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForUntreatedProducts() {
		Order order = new Order(new int[] {1,1}, new ProductCategory[] {ProductCategory.FOODSTUFFS, ProductCategory.BOOKS, ProductCategory.PHARMACEUTCAL});
		try {
			OrderUtilities.registerOrder(order, 1);
			fail("The method should not work with the given budget.");
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForInsuficientOrderInformation() {
		Order order = new Order(new int[] {7}, new ProductCategory[] {ProductCategory.NEW_CATEGORY});
		try {
			OrderUtilities.registerOrder(order, 100);
			fail("The method should not work with the specified products.");
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForInsuficientFunds() {
		Order order = new Order(new int[] {1,1}, new ProductCategory[] {ProductCategory.FOODSTUFFS, ProductCategory.BOOKS, ProductCategory.PHARMACEUTCAL});
		try {
			OrderUtilities.registerOrder(order, 1);
			fail("The method should not work with the given budget.");
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOrderForInvalidOrder() {
		Order order = new Order();
		try {
			OrderUtilities.registerOrder(order, 100);
			fail("The method should not work without products or number of products.");
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		} catch (InvalidProductCategoryException e) {
			e.printStackTrace();
		} catch (InsufficientOrderInformationException e) {
			e.printStackTrace();
		}
	}
}
