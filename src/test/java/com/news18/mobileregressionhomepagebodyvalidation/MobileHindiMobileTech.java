package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiMobileTech extends MobileCommonConfig{

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * This method is used to verify the Mobile Tech section title navigation present in the Home page
	 */
	@Test
	public void mobileTechTitle() {
		pages.mobileHindiLandingPage.verifyMobileTechTitle(serverType);
	}
	
	/**
	 * This method is used to verify the Mobile Tech section article navigation present in the
	 * the Home page
	 */	
	@Test
	public void mobileTechArticleList() {
		pages.mobileHindiLandingPage.verifyMobileTechArticleList(serverType);
	}
	
}
