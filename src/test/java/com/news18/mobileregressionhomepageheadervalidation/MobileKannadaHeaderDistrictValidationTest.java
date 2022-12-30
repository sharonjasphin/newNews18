package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Header District Logo 
 * on Mobile kannada HomePage.
 * @author DanishR
 */
public class MobileKannadaHeaderDistrictValidationTest extends MobileCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for kannada
	 * Language URL which is fetching from Property File
	 */
	//	@BeforeMethod
	public void navigateTokannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate Cities Navigation Present In District Icon Menu of Mobile kannada Home Page.
	 */
	@Test
	public void districtIconCitiesNavigations () {
		pages.mobileKannadaLandingPage.districtIconCitiesNavigations(serverType);
	}
}
