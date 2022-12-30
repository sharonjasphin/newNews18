package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiBodyKhelWidgetTest extends DesktopCommonConfig {

	
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
	public void bodyKhelArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyBodyKhelArticleNavigation(serverType);
	}

	@Test
	public void bodyKhelImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyBodyKhelImageNavigation(serverType);
	}
	
	@Test
	public void bodyKhelTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyBodyKhelTitleNavigation(serverType);
	}
	
	@Test
	public void bodyKhelTabsArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyBodyKhelTabsArticleNavigation(serverType);
	}
	
	@Test
	public void bodyKhelTabsImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyBodyKhelTabsImageNavigation(serverType);
	}
	
	@Test
	public void bodyKhelReadMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyBodyKhelReadMoreNavigation(serverType);
	}
}
