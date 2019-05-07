package ro.ase.cts;

import ro.ase.cts.exceptions.UnsupportedGameCharacterTypeException;
import ro.ase.cts.models.heroes.Warrior;
import ro.ase.cts.utils.BossFight;
import ro.ase.cts.utils.CharacterType;
import ro.ase.cts.utils.GameCharacterFactory;
import ro.ase.cts.utils.MonsterType;

public class Application {

	public static void main(String[] args) {
		try {
			Warrior warrior = (Warrior) GameCharacterFactory.getGameCharacter(CharacterType.TANK);
			warrior.setCharacterName("Leroy Jenkins");
			warrior.setSkills(new String[]{"SWORD ATTACK", "DASH FORWARD", "TAUNT EVERYTHING"});
			warrior.useAbility();
			warrior.useAbility();
			
			BossFight bossFight = new BossFight();
			for(int i = 0; i < 10; i++) {
				warrior.useAbility();
				try {
					bossFight.spawnMonster(MonsterType.BEAST).summonRoar();
					bossFight.spawnMonster(MonsterType.HUMAN).summonRoar();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		} catch (UnsupportedGameCharacterTypeException e) {
			e.printStackTrace();
		}
	}
}
