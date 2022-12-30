package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Mobile Malayalam HomePage 
 */
public class MobileMalayalamHomePageLinks extends MobileCommonConfig {

	/**
	 * This method is used to navigate to Malayalam News18 Home Page URL which is fetching from Property File
	 * URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToMalayalamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void malayalamHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnMobileHomepage();
	}
}

