package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiPhotoWidgetTest extends DesktopCommonConfig {


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
	public void photoArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyPhotoArticleNavigation(serverType);
	}

	@Test
	public void photoImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyPhotoImageNavigation(serverType);
	}

	@Test
	public void photoTabsArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyPhotoTabsArticleNavigation(serverType);
	}

	@Test
	public void photoTabsImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyPhotoTabsImageNavigation(serverType);
	}

	@Test
	public void photoTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyPhotoTitleNavigation(serverType);
	}
}
