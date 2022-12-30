package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This class Contains Test Files for Gujarati Language Superhit Gallery Section Article Navigation
 */
public class DesktopGujaratiSuperhitGalleryWidgetTest extends DesktopCommonConfig {


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
	 * This method validates the Superhit Gallery Article Navigation In Gujarati Homepage
	 */
	@Test
	public void superhitGalleryArticleNavigation()
	{
		pages.desktopGujaratiSanityLandingPage.verifySuperhitGalleryArticleNavigation(serverType);
	}

	
}

