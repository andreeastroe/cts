package dp.proxy;

public class ProxyImage implements IDisplay{
	//reference to the real object
	private Image image = null;
	//the local part of the proxy
	private String source;
	
	public ProxyImage( String source) {
		this.source = source;
	}

	@Override
	public void showImage() {
		if( image == null) {
			//first time we want to use the object
			this.image = new Image(this.source);
		}
		this.image.showImage();
	}
	
	
	
}
