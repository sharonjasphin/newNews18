package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the AMP Bengali HomePage 
 */
public class AmpBengaliHomePageLinks extends MobileCommonConfig {

	/**
	 * This method is used to navigate to AMP Bengali News18 Home Page URL which is fetching from Property File
	 * URL-https://bengali.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}

	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}

	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void bengaliHomePage() throws Throwable {
		changeToAmpURL();
		pages.homePageLinksValidation.verifyAllLinksOnMobileHomepage();
	}
}

