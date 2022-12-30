package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class validate URLs present on the Mobile Gujarati HomePage 
 */
public class MobileGujaratiHomePageLinks extends MobileCommonConfig {
	
	/**
	 * This method is used to navigate to Gujarati News18 Home Page URL which is fetching from Property File
	 * URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void gujaratiHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnMobileHomepage();
	}

}
