package com.news18.covidtracker;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This Class contains methods to validate Covid tracker update time
 */
public class DesktopTeluguCovidTracker extends  DesktopCommonConfig{
	
	/**
	 * This Method is used for Navigate To Url
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}
	
	
	/**
	 * @author AbhishekRaj
	 * This method is used to validate Covid Tracker News18 Telugu Home Page 
	 */
	@Test
	public void covidTrackerTeluguHomePageValidation() {
		pages.desktopTeluguLandingPage.clickOnTracker();//It will click on First Article Of English Home Page
	}

}