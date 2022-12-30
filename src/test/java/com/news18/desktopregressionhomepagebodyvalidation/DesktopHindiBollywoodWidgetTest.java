package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiBollywoodWidgetTest extends DesktopCommonConfig {

	
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
	public void bollywoodArticleNavigation()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
		pages.desktopHindiLandingPage.verifyBollywoodArticleNavigation("preProd");
	}
	
	@Test
	public void bollywoodImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyBollywoodImageNavigation(serverType);
	}
	
	@Test
	public void bollywoodTabsArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyBollywoodTabsArticleNavigation(serverType);
	}
	
	@Test
	public void bollywoodTabsImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyBollywoodTabsImageNavigation(serverType);
	}
	
	@Test
	public void bollywoodRaedMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyBollywoodReadMoreNavigation(serverType);
	}
	
	@Test
	public void bollywoodTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyBollywoodTitleNavigation(serverType);
	}
}
