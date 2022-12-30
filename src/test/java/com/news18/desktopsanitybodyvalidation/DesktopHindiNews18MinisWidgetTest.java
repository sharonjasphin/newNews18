package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopHindiNews18MinisWidgetTest extends DesktopCommonConfig{

	
	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	@Test
	public void news18MinisArticleNavigation()
	{
		pages.desktopHindiSanityLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
	

}
