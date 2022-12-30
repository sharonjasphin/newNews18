package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class contains Test Files to Validate Cities News in kannada HomePage Body 
 * for Pradesh News Widget
 */
public class MobileKannadaCitiesArticlesNavigationTest extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 HomePage for kannada Language URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateTokannadaHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify This method is used to Verify Cities Article Navigations
	 */
	@Test
	public void verifyCitiesArticlesNavigation()
	{
		pages.mobileKannadaLandingPage.kannadaMobileCitiesAticleLinksTest(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify This method is used to Verify Cities Read More
	 */
	@Test
	public void kannadaReadMoreNavigation()
	{
		pages.mobileKannadaLandingPage.verifyKannadaReadMoreNavigation("preProd");
	}
}
