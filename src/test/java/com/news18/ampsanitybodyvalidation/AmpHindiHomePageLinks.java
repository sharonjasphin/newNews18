package com.news18.ampsanitybodyvalidation;

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
	 * URL-https://news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void hindiAMPHomePage() throws Throwable {
		pages.homePageLinksValidation.verifyAllBetaLinks(serverType);
	}
}

