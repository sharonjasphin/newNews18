package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class contains Test Files to Validate Pradesh News in Hindi HomePage Body
 * for Pradesh News Widget
 */
public class DesktopHindiPradeshCityNamesTest extends DesktopCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to Verify Pradesh News City Names Navigation
	 */
	@Test
	public void pradeshNewsCityNamesNavigation()
	{
		pages.desktopHindiLandingPage.pradeshNewsCityNames(serverType);
	}
}
