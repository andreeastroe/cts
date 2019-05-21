package ro.ase.cts.models.flyweight;

public class CsGoBot implements GameBot{

	public final String SKIN;
	private String weapon;
	
	public CsGoBot() {
		SKIN = "Terrorist";
	}
	
	public void pickupWeapon(String weapon) {
		this.weapon = weapon;
		
	}

	@Override
	public String toString() {
		return "Summoned CsGoBot with skin " + SKIN + " and weapon " + this.weapon;
	}
}
