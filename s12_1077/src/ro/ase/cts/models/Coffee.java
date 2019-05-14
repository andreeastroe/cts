package ro.ase.cts.models;

public abstract class Coffee {

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String decription) {
		this.description = decription;
	}
	
	public abstract double getPrice();
}
