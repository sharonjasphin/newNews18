package com.news18.ampregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validates Desktop English HomePage Header Logo
 */
public class AMPEnglishHomePageLiveTv extends MobileCommonConfig {

	/**
	 * This method is used to navigate to English News18 Home Page URL which is fetched from Property File
	 * URL-https://news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}

	/**
	 * This method is used to validate Home Page Header Live Tv
	 */
	@Test
	public void headerLiveTv() {
		pages.ampLandingPage.verifyHeaderLiveTv(serverType);
	}
}

