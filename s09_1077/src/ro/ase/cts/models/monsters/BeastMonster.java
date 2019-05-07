package ro.ase.cts.models.monsters;

import ro.ase.cts.utils.MonsterType;

public class BeastMonster extends Monster {

	public BeastMonster() {
		this.setMonsterType(MonsterType.BEAST);
	}

	@Override
	public void summonRoar() {
		System.out.println(this.getMonsterType() + " has been summoned");
	}
}
