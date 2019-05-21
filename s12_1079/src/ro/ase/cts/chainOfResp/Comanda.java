package ro.ase.cts.chainOfResp;

public class Comanda {
 
	private int grad;
	private String denumire;
	
	public Comanda(int grad, String denumire) {
		super();
		this.grad = grad;
		this.denumire = denumire;
	}

	public int getGrad() {
		return grad;
	}

	public void setGrad(int grad) {
		this.grad = grad;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	
	
}
