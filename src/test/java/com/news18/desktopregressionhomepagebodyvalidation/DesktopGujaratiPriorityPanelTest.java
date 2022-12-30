package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class Contains Test Files for Gujarati Language Priority Panel Section Article and Image Navigation
 */
public class DesktopGujaratiPriorityPanelTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the Priority Panel Article Navigation In Gujarati Homepage
	 */
	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the Priority Panel Image Navigation In Gujarati Homepage
	 */
	@Test
	public void priorityPanelImageNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}
}
