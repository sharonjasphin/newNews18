package com.news18.desktopsanitybodyvalidation;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.Logs;
/**
 * @author 
 * This class contains Test Files to Validate The Article , Image Link Navigation 
 * for Priority Panel Widget
 */
public class DesktopGujaratiPriorityPanel extends DesktopCommonConfig{

	/**
	 * @author 
	 * This method is used to Verify The Priority Panel Image Navigation
	 */
	@Test
	public void priorityPanelImageNavigation() {
		pages.desktopGujaratiSanityLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}

	/**
	 * @author 
	 * This method is used to Verify The Priority Panel Headline Navigation
	 */

	@Test
	public void priorityPanelHeadlineNavigation() {
		pages.desktopGujaratiSanityLandingPage.verifyPriorityPanelHeadlineNavigation(serverType);
	}

	/**
	 * @author 
	 * This method is used to Verify The Priority Panel Article Navigation
	 */

	@Test
	public void priorityPanelArticleNavigation() {
		pages.desktopGujaratiSanityLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}
	/**
	 * @author 
	 * This method is used to verify the count of articles in the priority panel
	 */

	@Test
	public void priorityPanelArticleCount()
	{
		pages.desktopGujaratiSanityLandingPage.verifyPriorityPanelArticleCount();
	}
}




