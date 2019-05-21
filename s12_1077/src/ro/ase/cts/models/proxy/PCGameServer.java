package ro.ase.cts.models.proxy;

public class PCGameServer implements Platform {

	private int port;

	public PCGameServer(int port) {
		this.port = port;
		System.out.println("PCGameServer started on port " + this.port);
		
	}
	
	@Override
	public void connect(String type) {
		System.out.println("Connected to PCGameServer on port " + this.port);
		
	}
}
