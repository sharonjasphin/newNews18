package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This class contains Test Files to Validate The Article , Image and More Opinion News Link Navigation 
 * for Opinion Widget
 */
public class DesktopEnglishOpinionWidgetTest extends DesktopCommonConfig
{

	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author 
	 * This method is used to Verify The Health And Fitness Widget Article Text Navigation
	 */
	@Test
	public void healthAndFitnessArticleNavigation()
	{
		pages.desktopSanityLandingPage.verifyOpinionArticleNavigation(this.serverType);
	}
	
}
