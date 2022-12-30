package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileKannadaPriorityPanelWidgetTest extends MobileCommonConfig {

	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.mobileKannadaLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void priorityPanelImageNavigation()
	{
		pages.mobileKannadaLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}
	
	@Test
	public void priorityPanelRelatedNewsNavigation()
	{
		pages.mobileKannadaLandingPage.verifyPriorityPanelRelatedNewsNavigation(serverType);
	}
	
}
