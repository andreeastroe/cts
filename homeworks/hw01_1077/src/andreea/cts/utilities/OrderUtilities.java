package andreea.cts.utilities;

import andreea.cts.exceptions.InsufficientFundsException;
import andreea.cts.exceptions.InsufficientOrderInformationException;
import andreea.cts.exceptions.InvalidProductCategoryException;
import andreea.cts.models.CurrentPrices;
import andreea.cts.models.Order;
import andreea.cts.models.ProductCategory;

public class OrderUtilities {

	public static double registerOrder(Order order, double budget) throws InsufficientFundsException, InvalidProductCategoryException, InsufficientOrderInformationException {
		if(order.getListOfProducts().length == 0 || order.getNumberOfProducts().length == 0) {
			throw new InsufficientOrderInformationException("Invalid order!");
		}
		double[] pricesWithVAT = computePricesWithVAT(order.getListOfProducts());
		order.setValue(computeValueForOrder(pricesWithVAT, order.getNumberOfProducts()));
		if(order.getValue()>budget)
			throw new InsufficientFundsException("The value of the order exceeds the available budget");
		System.out.println(order.getValue());
		return order.getValue();
	}
	
	public static double[] computePricesWithVAT(ProductCategory[] listOfProducts) throws InvalidProductCategoryException {
		double[] pricesWithVAT = new double[listOfProducts.length];
		for(int i=0;i<listOfProducts.length;i++) {
			switch(listOfProducts[i]) {
			case FOODSTUFFS: pricesWithVAT[i]= CurrentPrices.currentPrices.get(ProductCategory.FOODSTUFFS.ordinal()) * 1.09;
				break;
			case PHARMACEUTCAL: pricesWithVAT[i]= CurrentPrices.currentPrices.get(ProductCategory.PHARMACEUTCAL.ordinal()) * 1.09;
				break;
			case CLOTHING_AND_HOUSEHOLD_LINEN: pricesWithVAT[i]= CurrentPrices.currentPrices.get(ProductCategory.CLOTHING_AND_HOUSEHOLD_LINEN.ordinal()) * 1.19;
				break;
			case SHOES_AND_LEATHER_GOODS: pricesWithVAT[i]= CurrentPrices.currentPrices.get(ProductCategory.SHOES_AND_LEATHER_GOODS.ordinal()) * 1.19;
				break;
			case BOOKS: pricesWithVAT[i]= CurrentPrices.currentPrices.get(ProductCategory.BOOKS.ordinal()) * 1.05;
				break;
			default: throw new InvalidProductCategoryException("The specified product category does not exist!");
			}
		}
		return pricesWithVAT;
	}
	
	public static double computeValueForOrder(double[] pricesWithVAT, int[] numberOfProducts) throws InsufficientOrderInformationException {
		if(pricesWithVAT.length != numberOfProducts.length) {
			throw new InsufficientOrderInformationException("Not enough information provided for the order!");
		}
		double orderValue = 0.0;
		for( int i= 0 ; i < pricesWithVAT.length ; i++) {
			orderValue += pricesWithVAT[i] * numberOfProducts[i];
		}
		return orderValue;
	}
}
