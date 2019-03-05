package ro.ase.cts;

public class ProductUtils {

	public static float computeFinalPrice(ProductCategory category, float productPrice, float customerSalary) throws InvalidProductCategoryException {
		float finalPrice = 0.0f;
		finalPrice = productPrice - computeDiscountForCustomerSalary(productPrice, customerSalary) - computeDiscountForProductCategory(category, productPrice);
		return finalPrice;
	}
	
	public static float computeDiscountForProductCategory( ProductCategory productCategory, float productPrice) throws InvalidProductCategoryException {
		float productDiscount = 0.0f;
		switch(productCategory) {
		case SMARTPHONE:
			productDiscount = productPrice * 0.03f;
			break;
		case TABLET:
			productDiscount = productPrice * 0.05f;
			break;
		case LAPTOP:
			productDiscount = productPrice * 0.07f;
			break;
		case DESKTOP:
			productDiscount = productPrice * 0.1f;
			break;
		default:
			throw new InvalidProductCategoryException("No implementation for the specific category.");
		}
		return productDiscount;
	}
	
	public static float computeDiscountForCustomerSalary(float productPrice, float customerSalary) {
		return customerSalary >= 2000 && customerSalary <= 10000?productPrice * 0.05f:productPrice * 0.02f;
	}
}
