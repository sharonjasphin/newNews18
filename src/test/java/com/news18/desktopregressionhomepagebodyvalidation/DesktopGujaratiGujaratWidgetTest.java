package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiGujaratWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify Title Navigations
	 */
	@Test
	public void gujaratTitleNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyGujaratTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to Verify Slider Navigations
	 */
	@Test
	public void gujaratCitiesSliderNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyGujaratSliderNavigation();
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify Cities Article Navigations
	 */
	@Test
	public void gujaratCitiesNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyGujaratCitiesNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify Read More Navigations
	 */
	@Test
	public void gujaratReadMoreNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyGujaratReadMoreNavigation(serverType);
	}
}
