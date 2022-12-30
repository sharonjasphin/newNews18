package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiBollywoodTest extends MobileCommonConfig{
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
	public void bollywoodTitle() {
		pages.mobileHindiLandingPage.verifyBollywoodTitle(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Naukri section article navigation present in the
	 * the Home page
	 */	
	@Test
	public void bollywoodArticle() {
		pages.mobileHindiLandingPage.verifyBollywoodArticle(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bollyhoodReadmore() {
		pages.mobileHindiLandingPage.verifyBollywoodReadmore(serverType);
	}
	
}
