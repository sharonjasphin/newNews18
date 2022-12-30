package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatMaharashtraWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void maharashtraArticleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraArticleNavigation(serverType);
	}
	
	@Test
	public void maharashtraImageNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraImageNavigation(serverType);
	}
	
	@Test
	public void maharashtraTitleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraTitleNavigation(serverType);
	}
	
	@Test
	public void maharashtraReadMoreNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraReadMoreNavigation(serverType);
	}
}
