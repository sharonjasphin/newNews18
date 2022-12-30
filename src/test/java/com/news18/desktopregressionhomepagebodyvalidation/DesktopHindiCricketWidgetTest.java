package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiCricketWidgetTest extends DesktopCommonConfig {

	
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
	public void cricketArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyCricketArticleNavigation(serverType);
	}
	
	@Test
	public void cricketImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyCricketImageNavigation(serverType);
	}
	
	@Test
	public void readMoreCricketNewsNavigation()
	{
		pages.desktopHindiLandingPage.verifyMoreCricketNewsNavigation(serverType);
	}
	
	@Test
	public void cricketDhamalNavigation()
	{
		pages.desktopHindiLandingPage.verifyCricketDhamalNavigation(serverType);
	}
	
	@Test
	public void cricketTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyCricketTitleNavigation(serverType);
	}
}
