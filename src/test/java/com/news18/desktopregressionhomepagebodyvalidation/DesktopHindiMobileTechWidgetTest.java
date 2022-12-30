package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiMobileTechWidgetTest extends DesktopCommonConfig
{


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
	public void mobileTechTabsArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyMobileTechTabsArticleNavigation(serverType);
	}


	@Test
	public void mobileTechTabsImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyMobileTechTabsImageNavigation(serverType);
	}

	@Test
	public void mobileTechReadMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyMobileTechReadMoreNavigation(serverType);
	}

	@Test
	public void mobileTechTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyMobileTechTitleNavigation(serverType);
	}
}
