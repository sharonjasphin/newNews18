package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class validate URLs present on the Desktop Kannada HomePage 
 */
public class DesktopKannadaHomePageLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Kannada News18 Home Page URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}

	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void kannadaHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnHomepage();
	}

}
