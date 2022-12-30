package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Health and Fitness News Link Navigation 
 * for Health and Fitness Widget
 */
public class DesktopEnglishHealthAndFitnessWidgetTest extends DesktopCommonConfig
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
	 * This method is used to Verify The Health And Fitness Widget Article Text Navigation
	 */
	@Test
	public void healthAndFitnessArticleNavigation()
	{
		pages.desktopLandingPage.verifyHealthAndFitnessArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Health And Fitness Widget Image Navigation
	 */
	@Test
	public void healthAndFitnessImageNavigation()
	{
		pages.desktopLandingPage.verifyHealthAndFitnessImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More Health And Fitness News Navigation
	 */
	@Test
	public void healthAndFitnessMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyHealthAndFitnessMoreNewsNavigation(this.serverType);
	}
}
