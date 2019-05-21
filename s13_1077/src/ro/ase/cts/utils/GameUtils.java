package ro.ase.cts.utils;

import java.util.Random;

public class GameUtils {

	public static String getRandomBotType() {
		String[] botTypes =  new String[] {"FORTNITE", "CSGO"};
		Random random = new Random();
		return botTypes[random.nextInt(botTypes.length)];
	}
	
public static String getRandomWeapon() {
	String[] weapons =  new String[] {"AK47", "KNIFE", "SNIPER", "M4AI"};
	Random random = new Random();
	return weapons[random.nextInt(weapons.length)];
	}
}
