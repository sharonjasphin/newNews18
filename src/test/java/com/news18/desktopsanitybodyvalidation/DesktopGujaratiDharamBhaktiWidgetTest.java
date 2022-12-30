package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language DharamBhakti Section Article Navigation
 */
public class DesktopGujaratiDharamBhaktiWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * This method validates the DharamBhakti Article Navigation In Gujarati Homepage
	 */
	@Test
	public void dharamBhaktiArticleNavigation()
	{
		pages.desktopGujaratiSanityLandingPage.verifyDharamBhaktiArticleNavigation(serverType);
	}
	

}
