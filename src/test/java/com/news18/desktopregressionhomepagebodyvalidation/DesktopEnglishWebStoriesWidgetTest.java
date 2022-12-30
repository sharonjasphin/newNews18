package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and See More Link Navigation 
 * for WenStories Widget
 */
public class DesktopEnglishWebStoriesWidgetTest extends DesktopCommonConfig 
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
	 * This method is used to Verify The WebStories Widget Right and Left Arrow Navigation
	 */
	@Test
	public void webStoriesSliderNavigation()
	{
		pages.desktopLandingPage.verifyWebStoriesSliderNavigation();
	}
	

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The WebStories Widget Article Text Navigation
	 */
	@Test
	public void webStoriesArticleNavigation()
	{
		pages.desktopLandingPage.verifyWebStoriesArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The WebStories Widget Image Navigation
	 */
	@Test
	public void webStoriesImageNavigation()
	{
		pages.desktopLandingPage.verifyWebStoriesImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The See More WebStories Navigation
	 */
	@Test
	public void webStoriesSeeMoreNavigation()
	{
		pages.desktopLandingPage.verifyWebStoriesSeeMoreNavigation(this.serverType);
	}
}
