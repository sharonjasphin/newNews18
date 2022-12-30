package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author 
 * This class validate URLs present on the Mobile Gujarati HomePage 
 */
public class MobileGujaratiHomePageLinks extends MobileCommonConfig{

	/**
	 * This method is used to navigate to Mobile Gujarati News18 Home Page URL which is fetching from Property File
	 * URL-https://news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void gujaratiMobileHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllBetaLinks(serverType);
	}
}
