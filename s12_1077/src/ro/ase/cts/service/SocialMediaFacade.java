package ro.ase.cts.service;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFacade {

	public List<SocialMediaService> socialMediaServices = new ArrayList<>();
	
	public int getAwarenessFromAllSocialMediaNetworks(String keyword) {
		int counter = 0;
		for (SocialMediaService socialMediaService : this.socialMediaServices) {
			counter+=socialMediaService.getCountSocialMediaPosts(keyword);
		}
		return counter;
	}
}
