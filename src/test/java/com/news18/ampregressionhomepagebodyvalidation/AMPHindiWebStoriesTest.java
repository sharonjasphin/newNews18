package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This class contains Test Files to Validate The Article , Image and More World News Link Navigation 
 * for Web Stories Widget
 */
public class AMPHindiWebStoriesTest extends MobileCommonConfig {

	/**
	 * @author DanishR
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampHindiUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify the Web Stories Section in Homepage
	 */
	@Test
	public void verifyWebStoriesTitle()
	{
		pages.ampHindiLandingPage.verifyWebStoriesTitle(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify the Web Stories Section in Homepage
	 */
	@Test
	public void webStoriesArticleNavigation()
	{
		pages.ampHindiLandingPage.verifyWebStoriesSectionArticles(serverType);
	}

}
