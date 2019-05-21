package ro.ase.cts.chainOfResp;

public class Bucatar extends Handler{

	@Override
	public void procesare(Comanda comanda) {
		if(comanda.getGrad()<5) {
			System.out.println("Nu trebuia sa ajunga la bucatar");
		}
		if(comanda.getGrad()<=100) {
			System.out.println("Bucatarul a preparat " + comanda.getDenumire());
		}
		else {
			System.out.println("Bucatarul nu poate prepara...");
			if(this.succesor!=null) {
				this.succesor.procesare(comanda);
			}
		}
	}

}
