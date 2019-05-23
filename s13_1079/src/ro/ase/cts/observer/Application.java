package ro.ase.cts.observer;

public class Application {

	public static void main(String[] args) {
		//observers
		IObserver observer1 = new Buyer("Gigel");
		IObserver observer2 = new Buyer("Maria");
		
		//observable
		RealEstateAp ap = new RealEstateAp(230000, "Dacia", false, "ABC03");
		
		//subscribe
		ap.addObserver(observer1);
		ap.addObserver(observer2);
		
		ap.setPrice(220000);
	}

}
