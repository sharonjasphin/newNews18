package com.news18.homepagelinksvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class validate URLs present on the AMP Hindi HomePage 
 */
public class AmpHindiHomePageLinks extends MobileCommonConfig {

	/**
	 * This method is used to navigate to AMP Hindi News18 Home Page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
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
	public void hindiHomePage() throws Throwable {
		changeToAmpURL();
		pages.homePageLinksValidation.verifyAllLinksOnMobileHomepage();
	}
}

