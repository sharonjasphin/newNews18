package com.news18.covidtracker;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTeluguCovidTracker extends MobileCommonConfig{

	/**
	 * This Method is used for Navigate To Url
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}


	/**
	 * This method is used to validate Covid Tracker News18 Telugu Home Page 
	 */
	@Test
	public void covidTrackerHomePageMobileValidation() {
		pages.mobileTeluguLandingPage.clickOnMobileTracker();//It will click on First Article Of English Home Page
	}

}
