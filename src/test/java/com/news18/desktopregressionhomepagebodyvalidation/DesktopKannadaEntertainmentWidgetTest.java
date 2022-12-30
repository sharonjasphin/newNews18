package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaEntertainmentWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	@Test
	public void entertainmentArticleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyEntertainmentArticleNavigation(serverType);
	}
	
	@Test
	public void entertainmentImageNavigation()
	{
		pages.desktopKannadaLandingPage.verifyEntertainmentImageNavigation(serverType);
	}
	
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.desktopKannadaLandingPage.verifyEntertainmentReadMoreNavigation(serverType);
	}
	
	@Test
	public void entertainmentTitleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyEntertainmentTitleNavigation(serverType);
	}
}
