package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiWebstoriesWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the Webstories Article Navigation In Gujarati Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method validates the Webstories Image Navigation In Gujarati Homepage
	 */
	@Test
	public void webstoriesImageNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyWebstoriesImageNavigation(serverType);
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the Webstories Slider Navigation In Gujarati Homepage
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyWebstoriesSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the Webstories Title Navigation In Gujarati Homepage
	 */
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
