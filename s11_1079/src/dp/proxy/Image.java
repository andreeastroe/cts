package dp.proxy;

public class Image implements IDisplay{
	//real object
	private String source;
	
	public Image(String source) {
		super();
		this.source = source;
		addImageToCache();
	}

	private void addImageToCache() {
		System.out.println("Storing in cache");
	}
	
	@Override
	public void showImage() {
		System.out.println("Displaying the image...");
	}

}
