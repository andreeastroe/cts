package ro.ase.cts.controlers;

import java.util.Random;

import ro.ase.cts.external.InstagramAPI;

public class InstagramAPIImpl implements InstagramAPI{

	private static final String API_URL= "https://instagram.com/api/v1";
	
	@Override
	public int getPostsFromInstagram(String hashtag) {
		System.out.println("Fake http call to " + API_URL + "?hashtag=" + hashtag);
		Random random = new Random();
		return random.nextInt(100);
	}

}
