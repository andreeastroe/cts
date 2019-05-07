package ro.ase.cts.models.monsters;

import ro.ase.cts.utils.MonsterType;

public class HumanMonster extends Monster{

	public HumanMonster() {
		this.setMonsterType(MonsterType.HUMAN);
	}
	
	@Override
	public void summonRoar() {
		System.out.println(this.getMonsterType() + " has been summoned");
	}
}
