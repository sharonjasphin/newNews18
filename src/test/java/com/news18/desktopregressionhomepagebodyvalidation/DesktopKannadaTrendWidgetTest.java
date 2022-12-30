package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaTrendWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	@Test
	public void trendArticleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTrendArticleNavigation(serverType);
	}
	
	@Test
	public void trendImageNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTrendImageNavigation(serverType);
	}
	
	@Test
	public void trendReadMoreNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTrendReadMoreNavigation(serverType);
	}
	
	@Test
	public void trendTitleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTrendTitleNavigation(serverType);
	}
}
