package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPriorityPanel extends DesktopCommonConfig{

	@Test
	public void priorityPanelArticleNavigation() {
		pages.desktopSanityLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void priorityPanelHeaderNavigation() {
		pages.desktopSanityLandingPage.verifyPriorityPanelHeaderNavigation(serverType);
	}
	
	@Test
	public void priorityPanelImageNavigation() {
		pages.desktopSanityLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}
}
