package andreea.cts.models;

public class Order {

	private int[] numberOfProducts;
	private ProductCategory[] listOfProducts;
	private double value;
	
	public Order() {
		this.numberOfProducts = new int[0];
		this.listOfProducts = new ProductCategory[0];
	}
	
	public Order(int[] numberOfProducts, ProductCategory[] listOfProducts) {
		super();
		this.numberOfProducts = numberOfProducts;
		this.listOfProducts = listOfProducts;
	}



	public Order(int[] numberOfProducts, ProductCategory[] listOfProducts, double value) {
		super();
		this.numberOfProducts = numberOfProducts;
		this.listOfProducts = listOfProducts;
		this.value = value;
	}
	
	public int[] getNumberOfProducts() {
		return numberOfProducts;
	}
	public void setNumberOfProducts(int[] numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
	public ProductCategory[] getListOfProducts() {
		return listOfProducts;
	}
	public void setListOfProducts(ProductCategory[] listOfProducts) {
		this.listOfProducts = listOfProducts;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
}
