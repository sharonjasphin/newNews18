package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of Horoscope scection
 */
public class AMPEnglishHomePageHoroscopeWidget extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate forward arrow button of horoscope section
	 */
	@Test
	public void verifyEnglishHomePageHoroscopeForwardArrowButton() {
		pages.ampLandingPage.verifyHoroscopeForwardArrow();        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Backward arrow button of horoscope section
	 */
	@Test
	public void verifyEnglishHomePageHoroscopeBackArrowButton() {
		pages.ampLandingPage.verifyHoroscopeBackArrow();        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate horoscope description for each sign in horoscope section
	 */
	@Test
	public void verifyEnglishHomePageHoroscopeSignDescription() {
		pages.ampLandingPage.verifyHoroscopeDescription(this.serverType);        
	}
	
	
	

}
