package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class AMPHindiMobileTechTest extends MobileCommonConfig{
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
	 * @author VipinKumarGawande
	 * This method is used to verify the Naukri section title navigation present in the Home page
	 */
	@Test
	public void mobileTechTitle() {
		pages.ampHindiLandingPage.verifyMobileTechTitle(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Naukri section article navigation present in the
	 * the Home page
	 */	
	@Test
	public void mobileTechArticleList() {
		pages.ampHindiLandingPage.verifyMobileTechArticleList(serverType);
	}
	
}
