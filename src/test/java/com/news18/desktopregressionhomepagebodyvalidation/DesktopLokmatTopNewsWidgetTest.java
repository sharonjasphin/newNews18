package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatTopNewsWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void topNewsArticleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyTopNewsArticleNavigation(serverType);
	}
	
	@Test
	public void topNewsImageNavigation()
	{
		pages.desktopLokmatLandingPage.verifyTopNewsImageNavigation(serverType);
	}
	
	@Test
	public void topNewsTitleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyTopNewsTitleNavigation(serverType);
	}
}
