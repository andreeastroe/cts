package ro.ase.cts.controlers;

import java.util.Random;

import ro.ase.cts.external.FacebookAPI;

public class FacebookAPIImpl implements FacebookAPI{

	private static final String API_URL= "https://facebook.com/api/v1";
	
	@Override
	public int getPostsFromFacebook(String keyword) {
		System.out.println("Fake http call to " + API_URL + "?keyword=" + keyword);
		Random random = new Random();
		return random.nextInt(100);
	}

	
}
