package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More News From News18Showsha Link Navigation 
 * for News18 Showsha Widget
 */
public class DesktopEnglishNews18ShowshaWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to Verify The Showsha Widget Article Text Navigation
	 */
	@Test
	public void news18ShowshaArticleNavigation()
	{
		pages.desktopLandingPage.verifyNews18ShowshaArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Showsha Widget Image Navigation
	 */
	@Test
	public void news18ShowshaImageNavigation()
	{
		pages.desktopLandingPage.verifyNews18ShowshaImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More From News18 Showsha Navigation
	 */
	@Test
	public void moreFromNews18Showsha()
	{
		pages.desktopLandingPage.verifyMoreFromNews18Showsha(this.serverType);
	}
	
	@Test
	public void news18ShowshaLogoNavigation()
	{
		pages.desktopLandingPage.verifyNews18ShowshaLogoNavigation(this.serverType);
	}
	
	
}
