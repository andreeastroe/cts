package ro.ase.cts.command;

public class ComandaPizza implements IComanda{

	private String tipPizza;
	private Bucatar bucatar;
	
	public ComandaPizza(String tipPizza, Bucatar bucatar) {
		super();
		this.tipPizza = tipPizza;
		this.bucatar = bucatar;
	}

	@Override
	public void prepara() {
		this.bucatar.gatestePizza(this.tipPizza);
		
	}

}
