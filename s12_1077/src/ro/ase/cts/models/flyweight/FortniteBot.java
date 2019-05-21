package ro.ase.cts.models.flyweight;

public class FortniteBot implements GameBot {

	private final String SKIN;
	private String weapon;
	
	public FortniteBot() {
		SKIN = "FLOSS";
	}
	
	public void pickupWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Summoned FortniteBot with skin " + SKIN + " and weapon " + this.weapon;
	}
	
}
