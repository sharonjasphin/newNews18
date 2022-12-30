package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Desktop Odia HomePage 
 */
public class DesktopOdiaHomePageLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Odia Home Page URL which is fetching from Property File
	 * URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void odiaHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllLinksOnHomepage();
	}
}

