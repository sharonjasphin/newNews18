package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Gujarat Section Article Navigation
 */
public class DesktopGujaratiGujaratWidgetTest extends DesktopCommonConfig {

	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	/**
	 * @author 
	 * This method is used to Verify Cities Article Navigations
	 */
	@Test
	public void gujaratCitiesNavigation()
	{
		pages.desktopGujaratiSanityLandingPage.verifyGujaratCitiesNavigation(serverType);
	}

}
