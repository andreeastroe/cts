package ro.ase.cts.controlers;

import java.util.Random;

import ro.ase.cts.external.TwitterAPI;

public class TwitterAPIImpl implements TwitterAPI{

	private static final String API_URL= "https://twitter.com/api/v2";
	
	@Override
	public int getPostsFromTwitter(String hashtag) {
		System.out.println("Fake http call to " + API_URL + "?hashtag=" + hashtag);
		Random random = new Random();
		return random.nextInt(100);
	}

}
