package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Sports News Link Navigation 
 * for Sports Widget
 */
public class DesktopEnglishSportsWidgetTest extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Sports Widget Article Text Navigation
	 */
	@Test
	public void sportsArticleNavigation()
	{
		pages.desktopLandingPage.verifySportsArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Sports Widget Image Navigation
	 */
	@Test
	public void sportsImageNavigation()
	{
		pages.desktopLandingPage.verifySportsImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More Sports News Navigation
	 */
	@Test
	public void sportsMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifySportsMoreNewsNavigation(this.serverType);
	}
}
