package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and Tabs Link Navigation 
 * for CricketNext Widget
 */

public class DesktopEnglishCricketNextWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("engBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext Widget Article Text Navigation
	 */
	@Test
	public void cricketNextArticleNavigation()
	{
		pages.desktopLandingPage.verifyCricketNextArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Buzz Widget Image Navigation
	 */
	@Test
	public void cricketNextImageNavigation()
	{
		pages.desktopLandingPage.verifyCricketNextImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext News18 Logo Navigation 
	 */
	@Test
	public void cricketNextNews18LogoNavigation()
	{
		pages.desktopLandingPage.verifyCricketNextNews18LogoNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext Logo Navigation 
	 */
	@Test
	public void cricketNextLogoNavigation()
	{
		pages.desktopLandingPage.verifyCricketNextNews18LogoNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext More News Navigation 
	 */
	@Test
	public void cricketNextMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyCricketNextMoreNewsNavigation(serverType);
	}
	
}
