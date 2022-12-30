package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class AMPHindiBollywoodWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinAmpBeta"));
	}
	
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bollywoodArticleNavigation()
	{
		pages.ampHindiLandingPage.verifyBollywoodArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bollywoodImageNavigation()
	{
		pages.ampHindiLandingPage.verifyBollywoodImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void moreBollywoodNewsNavigation()
	{
		pages.ampHindiLandingPage.verifyMoreBollywoodNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bollywoodTitleNavigation()
	{
		pages.ampHindiLandingPage.verifyBollywoodTitleNavigation(serverType);
	}
	
}
