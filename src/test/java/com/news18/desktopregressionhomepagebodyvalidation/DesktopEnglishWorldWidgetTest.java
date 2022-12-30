package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More World News Link Navigation 
 * for Auto Widget
 */
public class DesktopEnglishWorldWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to Verify The World Widget Article Text Navigation
	 */
	@Test
	public void worldArticleNavigation()
	{
		pages.desktopLandingPage.verifyWorldArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The World Widget Image Navigation
	 */
	@Test
	public void worldImageNavigation()
	{
		pages.desktopLandingPage.verifyWorldImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More World News Navigation
	 */
	@Test
	public void worldMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyWorldMoreNewsNavigation(this.serverType);
	}
}
