package ro.ase.cts.models.monsters;

import ro.ase.cts.utils.MonsterType;

public abstract class Monster implements Cloneable{

	private MonsterType monsterType;
	
	@Override
	public Monster clone() throws CloneNotSupportedException {
		Monster monster = null;
		monster = (Monster) super.clone();
		monster.monsterType = this.monsterType;
		return monster;
	}

	public MonsterType getMonsterType() {
		return monsterType;
	}

	public void setMonsterType(MonsterType monsterType) {
		this.monsterType = monsterType;
	}
	
	public abstract void summonRoar() ;
}
