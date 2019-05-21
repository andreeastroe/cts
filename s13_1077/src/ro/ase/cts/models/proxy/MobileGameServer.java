package ro.ase.cts.models.proxy;

public class MobileGameServer implements Platform {

	private int port;

	public MobileGameServer(int port) {
		this.port = port;
		System.out.println("MobileGameServer started on port " + this.port);
		
	}
	
	@Override
	public void connect(String type) {
		System.out.println("Connected to MobileGameServer on port " + this.port);
		
	}
}
