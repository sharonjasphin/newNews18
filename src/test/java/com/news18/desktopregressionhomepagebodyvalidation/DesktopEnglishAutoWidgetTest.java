package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Auto News Link Navigation 
 * for Auto Widget
 */
public class DesktopEnglishAutoWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to Verify The Auto Widget Article Text Navigation 
	 */
	@Test
	public void autoArticleNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("engBeta"));
		pages.desktopLandingPage.verifyAutoArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Auto Widget Image Navigation
	 */
	@Test
	public void autoImageNavigation()
	{
		pages.desktopLandingPage.verifyAutoImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Auto Widget More Auto News Navigation
	 */
	@Test
	public void moreAutoNewsNavigation()
	{
		pages.desktopLandingPage.verifyMoreAutoNews(this.serverType);
	}
	
}
