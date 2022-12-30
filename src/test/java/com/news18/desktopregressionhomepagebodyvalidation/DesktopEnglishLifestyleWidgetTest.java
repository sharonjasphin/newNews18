package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Lifestyle News Link Navigation 
 * for Lifestyle Widget
 */
public class DesktopEnglishLifestyleWidgetTest extends DesktopCommonConfig
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
	 * This method is used to Verify The Lifestyle Widget Article Text Navigation
	 */
	@Test
	public void lifestyleArticleNavigation()
	{
		pages.desktopLandingPage.verifyLifestyleArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Lifestyle Widget Image Navigation
	 */
	@Test
	public void lifestyleImageNavigation()
	{
		pages.desktopLandingPage.verifyLifestyleImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More Lifestyle News Navigation
	 */
	@Test
	public void lifestyleMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyLifestyleMoreNewsNavigation(this.serverType);
	}
}
