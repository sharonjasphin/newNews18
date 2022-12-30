package com.news18.desktopregressionhomepagebodyvalidation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image Link Navigation 
 * for Priority Panel Widget
 */
public class DesktopEnglishPriorityPanelTest extends DesktopCommonConfig{

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
	 * This method is used to Verify The Priority Panel Article Text Navigation
	 */
	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.desktopLandingPage.verifyPriorityPanelArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Priority Panel Image Navigation
	 */
	@Test
	public void priorityPanelImageNavigation()
	{
		pages.desktopLandingPage.verifyPriorityPanelImageNavigation(this.serverType);
	}

}