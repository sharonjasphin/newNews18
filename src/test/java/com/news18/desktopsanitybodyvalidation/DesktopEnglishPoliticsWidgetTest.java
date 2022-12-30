package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This class contains Test Files to Validate The Article , Image and More Politics News Link Navigation 
 * for Politics Widget
 */
public class DesktopEnglishPoliticsWidgetTest extends DesktopCommonConfig
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
	 * This method is used to Verify The Politics Widget Article Text Navigation
	 */
	@Test
	public void politicsArticleNavigation()
	{
		pages.desktopSanityLandingPage.verifyPoliticsArticleNavigation(this.serverType);
	}

	
	
}
