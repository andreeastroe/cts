package ro.ase.cts.utils;

import ro.ase.cts.exceptions.UnsupportedGameCharacterTypeException;
import ro.ase.cts.models.heroes.GameCharacter;
import ro.ase.cts.models.heroes.Healer;
import ro.ase.cts.models.heroes.Rogue;
import ro.ase.cts.models.heroes.Warrior;
import ro.ase.cts.models.heroes.Wizard;

public class GameCharacterFactory {

	public static GameCharacter getGameCharacter(CharacterType characterType) throws UnsupportedGameCharacterTypeException {
		switch(characterType) {
		case TANK:
			return new Warrior();
		case MAGE:
			return new Wizard();
		case ASSASIN:
			return new Rogue();
		case SUPPORT:
			return new Healer();
		default: throw new UnsupportedGameCharacterTypeException("No implementation found for type " + characterType);
		}
	}
}
