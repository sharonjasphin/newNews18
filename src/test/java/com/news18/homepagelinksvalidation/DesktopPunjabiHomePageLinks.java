package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Mobile Punjab HomePage 
 */
public class DesktopPunjabiHomePageLinks extends MobileCommonConfig {

	/**
	 * This method is used to navigate to Punjab News18 Home Page URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void punjabHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnMobileHomepage();
	}
}

