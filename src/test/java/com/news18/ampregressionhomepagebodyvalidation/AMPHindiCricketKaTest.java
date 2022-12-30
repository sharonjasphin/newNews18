package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Cricket Ka Test section present in the 
 * Home page
 */
public class AMPHindiCricketKaTest extends MobileCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to verify the cricket ka test section present at the RHS of the Home page
	 */
	@Test
	public void cricketKaTest() {
		pages.ampHindiLandingPage.verifyCricketKaTest();
	}
}
