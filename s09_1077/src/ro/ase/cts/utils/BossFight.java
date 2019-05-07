package ro.ase.cts.utils;

import java.util.HashMap;
import java.util.Map;

import ro.ase.cts.models.monsters.BeastMonster;
import ro.ase.cts.models.monsters.HumanMonster;
import ro.ase.cts.models.monsters.Monster;

public class BossFight {

	private Map<MonsterType, Monster> monsters = new HashMap<>();
	
	public BossFight() {
		monsters.put(MonsterType.HUMAN, new HumanMonster());
		monsters.put(MonsterType.BEAST, new BeastMonster());
	}
	
	public Monster spawnMonster( MonsterType type) throws CloneNotSupportedException {
		return monsters.get(type).clone();
	
	}
}
