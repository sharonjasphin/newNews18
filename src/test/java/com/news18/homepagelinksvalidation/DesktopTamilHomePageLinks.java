package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Desktop Tamil HomePage 
 */
public class DesktopTamilHomePageLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Tamil News18 Home Page URL which is fetching from Property File
	 * URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void tamilHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnHomepage();
	}
}

