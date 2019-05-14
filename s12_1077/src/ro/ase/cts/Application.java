package ro.ase.cts;

import ro.ase.cts.controlers.FacebookAPIImpl;
import ro.ase.cts.controlers.InstagramAPIImpl;
import ro.ase.cts.controlers.TwitterAPIImpl;
import ro.ase.cts.external.FacebookAPI;
import ro.ase.cts.external.InstagramAPI;
import ro.ase.cts.external.TwitterAPI;
import ro.ase.cts.models.Coffee;
import ro.ase.cts.models.DecafDecorator;
import ro.ase.cts.models.FlatWhite;
import ro.ase.cts.models.SocialMediaAdaptorClient;
import ro.ase.cts.models.SourCreamDecorator;
import ro.ase.cts.service.FacebookAPIAdaptor;
import ro.ase.cts.service.InstagramAPIAdaptor;
import ro.ase.cts.service.SocialMediaFacade;
import ro.ase.cts.service.TwitterAPIAdaptor;

public class Application {

	public static void main(String[] args) {
		Coffee flatWhite = new FlatWhite();
		System.out.println(flatWhite.getDescription());
		flatWhite = new SourCreamDecorator(flatWhite);
		System.out.println(flatWhite.getDescription());
		flatWhite = new DecafDecorator(flatWhite);
		System.out.println(flatWhite.getDescription());
		System.out.println(flatWhite.getPrice());
		
		FacebookAPI facebookAPI = new FacebookAPIImpl();
		System.out.println(facebookAPI.getPostsFromFacebook("awesome coffee"));
		
		InstagramAPI instagramAPI = new InstagramAPIImpl();
		System.out.println(instagramAPI.getPostsFromInstagram("#ineedcoffee"));
		
		TwitterAPI twitterAPI = new TwitterAPIImpl();
		System.out.println(twitterAPI.getPostsFromTwitter("#nomorningwithoutcoffee"));
		
		FacebookAPIAdaptor facebookAPIAdaptor = new FacebookAPIAdaptor(facebookAPI);
		InstagramAPIAdaptor instagramAPIAdaptor = new InstagramAPIAdaptor(instagramAPI);
		TwitterAPIAdaptor twitterAPIAdaptor = new TwitterAPIAdaptor(twitterAPI);
		
		SocialMediaAdaptorClient socialMediaAdaptorClient = new SocialMediaAdaptorClient(instagramAPIAdaptor, twitterAPIAdaptor, facebookAPIAdaptor);
		
		System.out.println(socialMediaAdaptorClient.getSOcialMediaAwareness("#coffee", "Instagram"));
		
		SocialMediaFacade socialMediaFacade = new SocialMediaFacade();
		socialMediaFacade.socialMediaServices.add(facebookAPIAdaptor);
		socialMediaFacade.socialMediaServices.add(twitterAPIAdaptor);
		socialMediaFacade.socialMediaServices.add(instagramAPIAdaptor);
		System.out.println(socialMediaFacade.getAwarenessFromAllSocialMediaNetworks("#coffee"));
	}

}
