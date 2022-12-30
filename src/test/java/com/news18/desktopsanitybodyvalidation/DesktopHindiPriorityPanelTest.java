package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiPriorityPanelTest extends DesktopCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}

//	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.desktopHindiSanityLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}

//	@Test
	public void priorityPanelImageNavigation()
	{
		pages.desktopHindiSanityLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}
	
	@Test
	public void priorityPanelArticleCount()
	{
		pages.desktopHindiSanityLandingPage.verifyPriorityPanelArticleCount();
	}
}
