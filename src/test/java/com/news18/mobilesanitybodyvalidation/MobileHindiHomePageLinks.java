package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Mobile English HomePage 
 */
public class MobileHindiHomePageLinks extends MobileCommonConfig {

	/**
	 * This method is used to navigate to Mobile English News18 Home Page URL which is fetching from Property File
	 * URL-https://news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void englishMobileHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllBetaLinks(serverType);
	}
}

