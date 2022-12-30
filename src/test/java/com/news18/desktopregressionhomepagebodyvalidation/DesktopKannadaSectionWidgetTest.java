package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaSectionWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Kannada Language URL which is fetching from Property File
	 * URL - https://betakannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("KannadaBeta"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify Title Navigations
	 */
	@Test
	public void kannadaTitleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyKannadaTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to Verify Slider Navigations
	 */
	@Test
	public void kannadaCitiesSliderNavigation()
	{
		pages.desktopKannadaLandingPage.verifyKannadaSliderNavigation();
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify Cities Article Navigations
	 */
	@Test
	public void kannadaCitiesNavigation()
	{
		pages.desktopKannadaLandingPage.kannadaCitiesAticleLinksTest(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify Read More Navigations
	 */
	@Test
	public void kannadaReadMoreNavigation()
	{
		pages.desktopKannadaLandingPage.verifyKannadaReadMoreNavigation(serverType);
	}
}
