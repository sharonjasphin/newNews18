package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validates Desktop English HomePage Header Logo
 */
public class MobileEnglishHomePageGoogleSearch extends MobileCommonConfig {

	/**
	 * This method is used to navigate to English News18 Home Page URL which is fetched from Property File
	 * URL-https://news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void googleSearch() {
		pages.mobileLandingPage.verfyGoogleSearch();
	}
}

