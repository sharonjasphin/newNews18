package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class contains Test Files to Validate Pradesh News in Hindi HomePage Body 
 * for Pradesh News Widget
 */
public class AMPHindiPradeshNewsTest extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampHindiUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to Verify Pradesh News Rajya List Navigation
	 */
	@Test
	public void pradeshNewsNavigation()
	{
		pages.ampHindiLandingPage.verifyPradeshNewsRajyaList(serverType);
	}
}
