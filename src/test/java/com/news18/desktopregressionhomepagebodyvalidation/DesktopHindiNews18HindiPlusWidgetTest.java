package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiNews18HindiPlusWidgetTest extends DesktopCommonConfig {



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
	public void news18HindiPlusArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18HindiPlusArticleNavigation(serverType);
	}

	@Test
	public void news18HindiPlusImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18HindiPlusImageNavigation(serverType);
	}

	@Test
	public void news18HindiPlusSliderNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18HindiPlusSliderNavigation();
	}

	@Test
	public void news18HindiPlusOriginalBanner()
	{
		pages.desktopHindiLandingPage.verifyNews18HindiPlusOriginalBannerNavigation(serverType);
	}
}
