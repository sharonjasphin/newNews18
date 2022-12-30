package com.news18.desktopregressionhomepagebodyvalidation;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of Horoscope scection
 */
public class DesktopEnglishHomePageHoroscopeWidget extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate content of the page is displaying as per the selection of any HOROSCOPE
	 */
	@Test
	public void verifyEnglishHomePageHoroscopeSignNavigation() {
		pages.desktopLandingPage.horoscopeTimeLineDescription();        
	}
	
	
	
}
