package ro.ase.cts.chainOfResp;

public class Application {

	public static void main(String[] args) {
		//responsabili
		
		Bucatar bucatar = new Bucatar();
		Ospatar ospatar = new Ospatar();
		
		//lant de responsabilitati
		ospatar.setSuccesor(bucatar);
		
		//comenzi
		Comanda c1 = new Comanda(4,  "cafea");
		Comanda c2 = new Comanda(15,  "pizza");
		Comanda c3 = new Comanda(120,  "trufe");
		
		System.out.println("COMANDA 1");
		ospatar.procesare(c1);
		System.out.println("COMANDA 2");
		ospatar.procesare(c2);
		System.out.println("COMANDA 3");
		ospatar.procesare(c3);
		
		//incercare de scurtcircuitare a lantului
		bucatar.procesare(c1);
	}
	
}
