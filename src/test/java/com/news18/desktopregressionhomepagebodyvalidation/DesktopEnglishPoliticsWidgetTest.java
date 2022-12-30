package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Politics News Link Navigation 
 * for Politics Widget
 */
public class DesktopEnglishPoliticsWidgetTest extends DesktopCommonConfig
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
	 * This method is used to Verify The Politics Widget Article Text Navigation
	 */
	@Test
	public void politicsArticleNavigation()
	{
		pages.desktopLandingPage.verifyPoliticsArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Politics Widget Image Navigation
	 */
	@Test
	public void politicsImageNavigation()
	{
		pages.desktopLandingPage.verifyPoliticsImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More Politics News Navigation
	 */
	@Test
	public void politicsMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyPoliticsMoreNewsNavigation(this.serverType);
	}
	
	
}
