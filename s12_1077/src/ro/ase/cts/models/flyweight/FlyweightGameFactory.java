package ro.ase.cts.models.flyweight;

import java.util.HashMap;
import ro.ase.cts.exceptions.UnsupportedBotTypeException;

public class FlyweightGameFactory {
	private static HashMap<String,GameBot> bots = new HashMap();
	
	public static GameBot gameBotFactory(String type) throws UnsupportedBotTypeException {
		if(bots.containsKey(type)) {
			return bots.get(type);
		} else {
			switch(type){
				case "FORTNITE": 
					GameBot bot = new FortniteBot();
					bots.put(type, bot);
					return bot;
				case "CSGO": 
					GameBot bot1 = new CsGoBot();
					bots.put(type, bot1);
					return bot1;
				default: throw new UnsupportedBotTypeException("Specified bot is not supported");
			}
		}
	}
}
