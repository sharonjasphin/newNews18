package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileKannadaEntertainmentWidgetTest extends MobileCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	@Test
	public void entertainmentArticleNavigation()
	{
		pages.mobileKannadaLandingPage.verifyEntertainmentArticleNavigation(serverType);
	}
	
	@Test
	public void entertainmentImageNavigation()
	{
		pages.mobileKannadaLandingPage.verifyEntertainmentImageNavigation(serverType);
	}
	
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.mobileKannadaLandingPage.verifyEntertainmentReadMoreNavigation(serverType);
	}
	
	@Test
	public void entertainmentTitleNavigation()
	{
		pages.mobileKannadaLandingPage.verifyEntertainmentTitleNavigation(serverType);
	}
}
