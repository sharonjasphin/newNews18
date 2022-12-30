package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Desktop Urdu HomePage 
 */
public class DesktopUrduHomePageLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Urdu News18 Home Page URL which is fetching from Property File
	 * URL-https://Urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToUrduHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void urduHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnHomepage();
	}
}

