package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiHoroscopeWidgetTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampHindiUrl"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Horoscope Widget Image
	 */
	@Test
	public void verifyHindiHomePageHoroscopeDescription() {
		pages.ampHindiLandingPage.verifyHoroscopeDescription(this.serverType);        
	}
}
