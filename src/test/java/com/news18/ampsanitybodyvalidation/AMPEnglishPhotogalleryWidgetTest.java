package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPEnglishPhotogalleryWidgetTest extends MobileCommonConfig{
	
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	@Test
	public void photogalleryArticleNavigation()
	{
		pages.ampSanityLandingPage.verifyPhotogallerySectionArticleNavigation(serverType);
	}
}
