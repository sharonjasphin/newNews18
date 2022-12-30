package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Rahul
 This Test class contains the script to validate the Mobile Air Quality Index  Section widgets are clickable 
 *and navigated to their pages
 */
public class AMPHindiAirQualityWidget extends MobileCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinAmpBeta"));
	}
	/**
	 * This method is used to verify the Air Quality Index widgets present in the Home page of Mobile view
	 */
	@Test
	public void airQualityIndex() {
		pages.ampHindiLandingPage.verifyAirQualityIndex();
	}
}

