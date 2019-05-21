package ro.ase.cts.command;

import java.util.ArrayList;

public class Ospatar {

	//invoker, manager de comenzi
	private ArrayList<IComanda> listaComenzi = new ArrayList<>();
	
	//metode pentru preluare comenzi
	public void preluareComanda(IComanda c) {
		listaComenzi.add(c);
	}
	
	//metoda ce trimite intarziat toate comenzile stocate
	public void trimiteComenziLaBucatarie() {
		for(IComanda comanda : listaComenzi) {
			comanda.prepara();
		}
		listaComenzi.clear();
	}
}
