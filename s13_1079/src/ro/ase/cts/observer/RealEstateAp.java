package ro.ase.cts.observer;

public class RealEstateAp extends Observable {

	private float price;
	private String address;
	private boolean furbished;
	private String message;
	private String id;
	
	
	public RealEstateAp(int price, String address, boolean furbished, String id) {
		super();
		this.price = price;
		this.address = address;
		this.furbished = furbished;
		this.id = id;
	}

	//meth that will change the state of the object
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if(this.price > price) {
			message = "The price dropped by " + (this.price - price);
		}
		else {
			message = "The price increased by " + (price - this.price );
		}
		this.price = price;
		this.notifyAllObservers(message);
	}


	public boolean isFurbished() {
		return furbished;
	}

	public void setFurbished(boolean furbished) {
		this.furbished = furbished;
	}

	@Override
	String createMessage() {
		return message + " for appartment id " + this.id;
	}

}
