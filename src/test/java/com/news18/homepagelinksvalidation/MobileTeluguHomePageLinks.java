package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Mobile Telugu HomePage 
 */
public class MobileTeluguHomePageLinks extends MobileCommonConfig {

	/**
	 * This method is used to navigate to Telugu News18 Home Page URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void teluguHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnMobileHomepage();
	}
}

