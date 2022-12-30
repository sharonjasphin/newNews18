package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This class contains Test Files to Validate The Article , Image and Tabs Link Navigation 
 * for CricketNext Widget
 */

public class DesktopEnglishCricketNextWidgetTest extends DesktopCommonConfig {

	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("engBeta"));
	}
	
	/**
	 * @author 
	 * This method is used to Verify The CricketNext Widget Article Text Navigation
	 */
	@Test
	public void cricketNextArticleNavigation()
	{
		pages.desktopSanityLandingPage.verifyCricketNextArticleNavigation(serverType);
	}
	

	
}
