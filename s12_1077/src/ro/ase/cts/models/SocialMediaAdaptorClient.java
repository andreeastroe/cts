package ro.ase.cts.models;

import ro.ase.cts.service.FacebookAPIAdaptor;
import ro.ase.cts.service.InstagramAPIAdaptor;
import ro.ase.cts.service.TwitterAPIAdaptor;

public class SocialMediaAdaptorClient {
	
	private InstagramAPIAdaptor instagramAPIAdaptor;
	private TwitterAPIAdaptor twitterAPIAdaptor;
	private FacebookAPIAdaptor facebookAPIAdaptor;
	
	public SocialMediaAdaptorClient(InstagramAPIAdaptor instagramAPIAdaptor, TwitterAPIAdaptor twitterAPIAdaptor,
			FacebookAPIAdaptor facebookAPIAdaptor) {
		this.instagramAPIAdaptor = instagramAPIAdaptor;
		this.twitterAPIAdaptor = twitterAPIAdaptor;
		this.facebookAPIAdaptor = facebookAPIAdaptor;
	}
	
	public int getSOcialMediaAwareness(String keyword, String socialNetwork) {
		switch(socialNetwork) {
		case "Twitter":
			return this.twitterAPIAdaptor.getCountSocialMediaPosts(keyword);
		case "Facebook":
			return this.facebookAPIAdaptor.getCountSocialMediaPosts(keyword);
		case "Instagram":
			return this.instagramAPIAdaptor.getCountSocialMediaPosts(keyword);
			default: 
				return 0;
		}
	}
}
