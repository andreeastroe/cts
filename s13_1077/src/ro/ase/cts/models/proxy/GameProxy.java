package ro.ase.cts.models.proxy;

import java.util.ArrayList;
import java.util.List;

public class GameProxy implements Platform{

	private List<Platform> platforms = new ArrayList<>();
	private int port;
	
	public GameProxy(int port) {
		this.port = port;
		System.out.println("GameProxy started on port " + this.port);
	}
	
	public void addPlatform(Platform platform) {
		this.platforms.add(platform);
	}
	
	@Override
	public void connect(String type) {
		switch (type) {
		case "MOBILE":
			platforms.get(0).connect(type);
			break;
		case "PC":
			platforms.get(1).connect(type);
			break;
		default:
			System.out.println("Platform not supported");
			break;
		}
	}

	
}
