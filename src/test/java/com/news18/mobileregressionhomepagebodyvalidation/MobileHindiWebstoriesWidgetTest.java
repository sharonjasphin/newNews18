package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiWebstoriesWidgetTest extends MobileCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.mobileHindiLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void webstoriesImageNavigation()
	{
		pages.mobileHindiLandingPage.verifyWebstoriesImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.mobileHindiLandingPage.verifyWebstoriesSliderNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.mobileHindiLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
