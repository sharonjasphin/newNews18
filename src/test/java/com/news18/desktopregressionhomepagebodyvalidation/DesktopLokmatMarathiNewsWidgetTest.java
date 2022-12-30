package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatMarathiNewsWidgetTest extends DesktopCommonConfig 
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	
	@Test
	public void marathiNewsArticleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMarathiNewsArticleNavigation(serverType);
	}
	
	@Test
	public void marathiNewsImageNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMarathiNewsImageNavigation(serverType);
	}
}
