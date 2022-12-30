package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class contains Test Files to Validate Gujarat Section on Gujarat HomePage Body 
 * for Pradesh News Widget
 */
public class MobileGujaratiCitiesArticlesNavigationTest extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 HomePage for Gujarat Language URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToGujaratHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("GujaratUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify This method is used to Verify Cities Article Navigations
	 */
	@Test
	public void verifyCitiesArticlesNavigation()
	{
		pages.mobileGujaratiLandingPage.verifyGujaratCitiesNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify This method is used to Verify Cities Read More
	 */
	@Test
	public void gujaratReadMoreNavigation()
	{
		pages.mobileGujaratiLandingPage.verifyGujaratReadMoreNavigation("preProd");
	}
}
