package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class contains Test Files to Validate Pradesh News in Hindi HomePage Body 
 * for Pradesh News Widget
 */
public class AMPHindiPradeshStateWiseArticles extends MobileCommonConfig{

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
	 * This method is used to Verify Pradesh News State Wise Articles Navigation
	 */
	@Test
	public void pradeshNewsArticlesNavigation()
	{
		pages.ampHindiSanityLandingPage.pradeshNewsStatesWiseArticles(serverType);
	}
}
