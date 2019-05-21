package ro.ase.cts;

import ro.ase.cts.exceptions.UnsupportedBotTypeException;
import ro.ase.cts.models.flyweight.FlyweightGameFactory;
import ro.ase.cts.models.flyweight.GameBot;
import ro.ase.cts.models.proxy.GameProxy;
import ro.ase.cts.models.proxy.MobileGameServer;
import ro.ase.cts.models.proxy.PCGameServer;
import ro.ase.cts.utils.GameUtils;

public class Application {

	public static void main(String[] args) {
		for(int i = 0; i<100; i++) {
			try {
				GameBot bot = FlyweightGameFactory.gameBotFactory(GameUtils.getRandomBotType());
				bot.pickupWeapon(GameUtils.getRandomWeapon());
				//System.out.println(bot.toString());
			} catch (UnsupportedBotTypeException e) {
				e.printStackTrace();
			}
		}
		
		MobileGameServer mobileGameServer = new MobileGameServer(8090);
		PCGameServer pcGameServer = new PCGameServer(8091);
		GameProxy proxy = new GameProxy(8099);
		proxy.addPlatform(mobileGameServer);
		proxy.addPlatform(pcGameServer);
		proxy.connect("MOBILE");
		proxy.connect("PC");
	}
}
