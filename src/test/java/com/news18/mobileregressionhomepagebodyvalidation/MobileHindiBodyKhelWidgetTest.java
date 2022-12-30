package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiBodyKhelWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bodySportsTabArticleNavigation()
	{
		pages.mobileHindiLandingPage.verifyBodyKhelTabsArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bodySportsTabImageNavigation()
	{
		pages.mobileHindiLandingPage.verifyBodyKhelTabsImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bodySportsTabReadMoreNavigation()
	{
		pages.mobileHindiLandingPage.verifyBodyKhelReadMoreNavigation(serverType);
	}
}
