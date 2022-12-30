package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Buzz News Link Navigation 
 * for Buzz Widget
 */

public class DesktopEnglishBuzzWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to Verify The Buzz Widget Article Text Navigation
	 */
	@Test
	public void buzzArticleNavigation()
	{
		pages.desktopLandingPage.verifyBuzzArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Buzz Widget Image Navigation
	 */
	@Test
	public void buzzImageNavigation()
	{
		pages.desktopLandingPage.verifyBuzzImageValidation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Buzz Widget More Buzz News Navigation
	 */
	@Test
	public void buzzMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyMoreBuzzNewsNavigation(this.serverType);
	}
}

