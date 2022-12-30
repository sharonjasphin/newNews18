package com.news18.covidtracker;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileEnglishCovidTracker  extends  MobileCommonConfig{
	
	/**
	 * This Method is used for Navigate To Url
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	

	/**
	 * This method is used to validate Covid Tracker News18 English Home Page 
	 */
	@Test
	public void covidTrackerHomePageMobileValidation() {
		pages.mobileLandingPage.clickOnTrackerMobileView();//It will click on First Article Of English Home Page
	}

}
