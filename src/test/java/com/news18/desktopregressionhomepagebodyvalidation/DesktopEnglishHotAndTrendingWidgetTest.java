package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image Navigation for Hot and Trending Topics Widget
 */
public class DesktopEnglishHotAndTrendingWidgetTest extends DesktopCommonConfig
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
	 * This method is used to Verify The Hot And Trending Widget Article Text Navigation
	 */
	@Test
	public void hotAndTrendingArticleNavigation()
	{
		pages.desktopLandingPage.verifyHotAndTrendingImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Hot And Trending Widget Image Navigation
	 */
	@Test
	public void hotAndTrendingImageNavigation()
	{
		pages.desktopLandingPage.verifyHotAndTrendingImageNavigation(this.serverType);
	}
}
