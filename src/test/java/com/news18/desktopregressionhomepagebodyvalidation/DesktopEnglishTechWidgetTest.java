package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Tech News Link Navigation 
 * for Tech Widget
 */
public class DesktopEnglishTechWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to Verify The Tech Widget Article Text Navigation
	 */
	@Test
	public void techArticleNavigation()
	{
		pages.desktopLandingPage.verifyTechArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Tech Widget Image Navigation
	 */
	@Test
	public void techImageNavigation()
	{
		pages.desktopLandingPage.verifyTechImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More Tech News Navigation
	 */
	@Test
	public void techMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyMoreTechNews(this.serverType);
	}
}
