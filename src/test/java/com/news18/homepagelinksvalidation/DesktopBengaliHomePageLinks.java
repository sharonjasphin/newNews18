package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Desktop Bengali HomePage 
 */
public class DesktopBengaliHomePageLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Bengali News18 Home Page URL which is fetching from Property File
	 * URL-https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void bengaliHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnHomepage();
	}
}

