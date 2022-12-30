package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaPriorityPanelTest extends DesktopCommonConfig {

	
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void priorityPanelImageNavigation()
	{
		pages.desktopKannadaLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}
}
