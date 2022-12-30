package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatMoneyWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
	navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void moneyArticleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMoneyArticleNavigation(serverType);
	}
	
	@Test
	public void moneyImageNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMoneyImageNavigation(serverType);
	}
	
	@Test
	public void moneyTitleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMoneyTitleNavigation(serverType);
	}
	
	@Test
	public void moneyReadMoreNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMoneyReadMoreNavigation(serverType);
	}
}

