package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaTopNewsWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	@Test
	public void topNewsArticleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTopNewsArticleNavigation(serverType);
	}
	
	@Test
	public void topNewsImageNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTopNewsImageNavigation(serverType);
	}
}
