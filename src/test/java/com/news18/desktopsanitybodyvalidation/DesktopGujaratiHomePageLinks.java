package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This class validate URLs present on the Desktop Gujarati HomePage 
 */
public class DesktopGujaratiHomePageLinks extends DesktopCommonConfig{

	/**
	 * This method is used to navigate to Desktop Gujarati News18 Home Page URL which is fetching from Property File
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
