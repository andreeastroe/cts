package ro.ase.cts.service;

import ro.ase.cts.external.FacebookAPI;

public class FacebookAPIAdaptor implements SocialMediaService{

	private FacebookAPI facebookAPI;
	
	public FacebookAPIAdaptor(FacebookAPI facebookAPI) {
		super();
		this.facebookAPI = facebookAPI;
	}

	@Override
	public int getCountSocialMediaPosts(String keyword) {
		return this.facebookAPI.getPostsFromFacebook(keyword);
	}

}
