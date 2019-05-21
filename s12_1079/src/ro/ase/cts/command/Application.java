package ro.ase.cts.command;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class Application {

	public static void main(String[] args) {
		//executanti
		Bucatar bucatar1 = new Bucatar("Bucatar1");
		Bucatar bucatar2 = new Bucatar("Bucatar2");
		
		//invoker
		Ospatar ospatar = new Ospatar();
		
		//comenzi de tipuri diferite
		IComanda c1 = new ComandaPizza("pizzaaa", bucatar1);
		IComanda c2 = new ComandaPizza("pizzaaa2", bucatar2);
		IComanda c3 = new ComandaPaste("pasteee", "branzaaa", bucatar2);
		ospatar.preluareComanda(c1);
		ospatar.preluareComanda(c2);
		ospatar.preluareComanda(c3);
		
		//dupa un timp.. trimitere comenzi catre executanti
		ospatar.trimiteComenziLaBucatarie();
	}

}
