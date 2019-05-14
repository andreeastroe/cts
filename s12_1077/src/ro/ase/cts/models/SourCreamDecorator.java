package ro.ase.cts.models;

public class SourCreamDecorator extends ToppingDecorator {
	
	private Coffee coffee;
	
	public SourCreamDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return "Decaf " + this.coffee.getDescription();
	}

	@Override
	public double getPrice() {
		return this.coffee.getPrice() + 2;
	}
}
