package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiCricketWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
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
	public void cricketArticleNavigation()
	{
		pages.mobileHindiLandingPage.verifyCricketArticleNavigation(serverType);
	}
	
	/**
	 *@author VipinKumarGawande 
	 */
	@Test
	public void cricketImageNavigation()
	{
		pages.mobileHindiLandingPage.verifyCricketImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void readMoreCricketNewsNavigation()
	{
		pages.mobileHindiLandingPage.verifyMoreCricketNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void cricketDhamalNavigation()
	{
		pages.mobileHindiLandingPage.verifyCricketDhamalNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void cricketTitleNavigation()
	{
		pages.mobileHindiLandingPage.verifyCricketTitleNavigation(serverType);
	}
}
