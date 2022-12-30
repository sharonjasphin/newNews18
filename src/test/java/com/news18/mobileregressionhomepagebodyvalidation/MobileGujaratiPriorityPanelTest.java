package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiPriorityPanelTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the Priority Panel Article Navigation In Gujarati Homepage
	 */
	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.mobileGujaratiLandingPage.verifyPriorityPanelArticleNavigation("love");
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the Priority Panel Image Navigation In Gujarati Homepage
	 */
	@Test
	public void priorityPanelImageNavigation()
	{
		pages.mobileGujaratiLandingPage.verifyPriorityPanelImageNavigation("");
	}
}
