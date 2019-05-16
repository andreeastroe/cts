package dp.proxy;

public class Application {

	public static void main(String[] args) {
		IDisplay img = new ProxyImage("Caru cu bere");
		img.showImage();
		img.showImage();
		img.showImage();
	}

}
