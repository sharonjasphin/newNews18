package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatMaharashtraCitiesWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Title Navigations
	 */
	@Test
	public void maharashtraCitiesTitleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraTitleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Slider Navigations
	 */
	@Test
	public void maharashtraCitiesSliderNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraCitiesSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Cities Article Navigations
	 */
	@Test
	public void maharashtraCitiesArticleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraCitiesArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify Read More Navigations
	 */
	@Test
	public void maharashtraCitiesReadMoreNavigation()
	{
		pages.desktopLokmatLandingPage.verifyMaharashtraCitiesReadMoreNavigation(serverType);
	}
}
