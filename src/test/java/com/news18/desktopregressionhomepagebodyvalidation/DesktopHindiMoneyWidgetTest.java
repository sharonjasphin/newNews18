package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiMoneyWidgetTest extends DesktopCommonConfig {

	
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
	public void moneyArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoneyArticleNavigation(serverType);
	}
	
	@Test
	public void moneyImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoneyImageNavigation(serverType);
	}
	
	@Test
	public void moneyTabsArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoneyTabsArticleNavigation(serverType);
	}
	
	@Test
	public void moneyTabsImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoneyTabsImageNavigation(serverType);
	}
	
	@Test
	public void moneyTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoneyTitleNavigation(serverType);
	}
	
	@Test
	public void moneyControlBannerNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoneyControlNavigation();
	}
	
	@Test
	public void moneyReadMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoneyReadMoreNavigation(serverType);
	}
}

