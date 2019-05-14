package ro.ase.cts.service;

import ro.ase.cts.external.InstagramAPI;

public class InstagramAPIAdaptor implements SocialMediaService {

	private InstagramAPI instagramAPI;
	
	public InstagramAPIAdaptor(InstagramAPI instagramAPI) {
		this.instagramAPI = instagramAPI;
	}

	@Override
	public int getCountSocialMediaPosts(String keyword) {
		return this.instagramAPI.getPostsFromInstagram(keyword);
	}

}
