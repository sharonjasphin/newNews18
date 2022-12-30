package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiWebstoriesWidgetTest extends DesktopCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}

	@Test
	public void webstoriesArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}

	@Test
	public void webstoriesImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyWebstoriesImageNavigation(serverType);
	}
	
	
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.desktopHindiLandingPage.verifyWebstoriesSliderNavigation();
	}
	
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
