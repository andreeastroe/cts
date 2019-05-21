package ro.ase.cts.chainOfResp;

public class Ospatar extends Handler {

	@Override
	public void procesare(Comanda comanda) {
		if(comanda.getGrad()<=5) {
			System.out.println("Ospatarul a procesat " + comanda.getDenumire());
		}
		else {
			System.out.println("Ospatarul nu poate rezolva...");
			if(this.succesor!=null) {
				this.succesor.procesare(comanda);
			}
		}
	}

}
