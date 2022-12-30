package com.news18.covidtracker;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of English Desktop Covid tracker
 */
public class DesktopEnglishCovidTracker extends  DesktopCommonConfig{
	
	
	/**
	 * This Method is used for Navigate To Url
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	

	/**
	 * This method is used to validate Covid Tracker News18 English Home Page 
	 */
	@Test
	public void covidTrackerHomePageValidation() {
		pages.desktopLandingPage.clickOnTracker();//It will click on First Article Of English Home Page
		
	}
}