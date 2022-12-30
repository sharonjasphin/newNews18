package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and Left and Right Arrow Button Navigation 
 * for Videos Widget
 */
public class DesktopEnglishVideoWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to Verify The Videos Widget Left Arrow Navigation
	 */
	@Test
	public void videosLeftSliderNavigation()
	{
		pages.desktopLandingPage.verifyVideosLeftSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Videos Widget Right Arrow Navigation
	 */
	@Test
	public void videosRightSliderNavigation()
	{
		pages.desktopLandingPage.verifyVideosRightSliderNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Videos Widget Article Text Navigation
	 */
	@Test
	public void videosArticleNavigation()
	{
		pages.desktopLandingPage.verifyVideosArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Videos Widget Image Navigation
	 */
	@Test
	public void videosImageNavigation()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("engBeta"));
		pages.desktopLandingPage.verifyVideosImageNavigation("preProd");
	}
}
