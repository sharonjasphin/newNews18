package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiAjabGajabWidgetTest extends DesktopCommonConfig {
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
	
	/**
	 * @author 
	 */
	@Test
	public void ajabGajabArticleNavigation()
	{
		pages.desktopHindiSanityLandingPage.verifyAjabGajabArticleNavigation(serverType);
	}
}
