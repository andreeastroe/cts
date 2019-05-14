package ro.ase.cts.service;

import ro.ase.cts.external.TwitterAPI;

public class TwitterAPIAdaptor implements SocialMediaService{

	private TwitterAPI twitterAPI;
	
	public TwitterAPIAdaptor(TwitterAPI twitterAPI) {
		this.twitterAPI = twitterAPI;
	}
	
	@Override
	public int getCountSocialMediaPosts(String keyword) {
		return this.twitterAPI.getPostsFromTwitter(keyword);
	}

}
