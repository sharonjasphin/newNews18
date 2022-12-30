package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class Contains Test Files for Gujarati Language Superhit Gallery Section Article , Image and Title Navigation
 */
public class DesktopGujaratiSuperhitGalleryWidgetTest extends DesktopCommonConfig {


	/**
	 * @author DanishR
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
	//	@BeforeMethod
	public void navigateToGujaratiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}


	/**
	 * @author DanishR
	 * This method validates the Superhit Gallery Article Navigation In Gujarati Homepage
	 */
	@Test
	public void superhitGalleryArticleNavigation()
	{
		pages.desktopGujaratiLandingPage.verifySuperhitGalleryArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method validates the Superhit Gallery Image Navigation In Gujarati Homepage
	 */
	@Test
	public void superhitGalleryImageNavigation()
	{
		pages.desktopGujaratiLandingPage.verifySuperhitGalleryImageNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method validates the Superhit Gallery Title Navigation In Gujarati Homepage
	 */
	@Test
	public void superhitGalleryTitleNavigation()
	{
		pages.desktopGujaratiLandingPage.verifySuperhitGalleryTitleNavigation(serverType);
	}
	
}

