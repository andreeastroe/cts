package ro.ase.cts.models;

public class DecafDecorator extends ToppingDecorator{

	private Coffee coffee;

	public DecafDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return "Sour Cream " + this.coffee.getDescription();
	}

	@Override
	public double getPrice() {
		return this.coffee.getPrice() + 1;
	}
}
