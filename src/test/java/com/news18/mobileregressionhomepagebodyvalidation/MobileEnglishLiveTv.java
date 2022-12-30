package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Rahul
 *This Test class contains the script to validate the functionalities of the Live Tv section of Mobile view
 *present in the Home page
 */
public class MobileEnglishLiveTv extends MobileCommonConfig{
	
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * This method is used to verify the functionalities of the Live Tv Section present 
	 * in the Home page of Mobile view
	 * @throws InterruptedException
	 */
	@Test
	public void verifyMobileLiveTv() {
		pages.mobileLandingPage.liveTv();
	}
}
