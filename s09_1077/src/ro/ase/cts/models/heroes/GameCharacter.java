package ro.ase.cts.models.heroes;

import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

import javafx.scene.paint.RadialGradient;

public abstract class GameCharacter {
	private String characterName;
	private String[] skills;
	
	public abstract String UseSpecialAbility();

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public void useAbility() {
		Random random = new Random();
		int skillIndex = random.nextInt(this.skills.length);
		System.out.println(this.characterName + " is using " + this.skills[skillIndex]);
	}
}
