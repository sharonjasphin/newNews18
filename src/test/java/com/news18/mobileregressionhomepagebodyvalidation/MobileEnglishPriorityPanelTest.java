package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image Link Navigation for Priority Panel Section
 */
public class MobileEnglishPriorityPanelTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Priority Panel Article Text Navigation in Homepage
	 */
	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.mobileLandingPage.verifyPriorityPanelArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Priority Panel Image Navigation in Homepage
	 */
	@Test
	public void priorityPanelImageNavigation()
	{
		pages.mobileLandingPage.verifyPriorityPanelImageNavigation(this.serverType);
	}
}
