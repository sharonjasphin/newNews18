package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class validate URLs present on the Mobile Hindi HomePage 
 */
public class MobileHindiHomePageLinks extends MobileCommonConfig {

	/**
	 * This method is used to navigate to Mobile Hindi News18 Home Page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void hindiHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnMobileHomepage();
	}
}

