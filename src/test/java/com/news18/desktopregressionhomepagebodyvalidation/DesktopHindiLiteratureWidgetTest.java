package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiLiteratureWidgetTest extends DesktopCommonConfig {

	
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
	public void literatureArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyLiteratureArticleNavigation(serverType);
	}

	@Test
	public void literatureImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyLiteratureImageNavigation(serverType);
	}
	
	@Test
	public void verifyLiteratureReadMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyLiteratureReadMoreNavigation(serverType);
	}

	@Test
	public void verifyLiteratureTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyLiteratureTitleNavigation(serverType);
	}
}

