package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author 
 *
 */
public class MobileHindiNews18HindiPlusWidgetTest extends MobileCommonConfig {
	
	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * @author 
	 */
	@Test
	public void news18HindiPlusArticleNavigation()
	{
		pages.mobileHindiSanityLandingPage.verifyNews18HindiPlusArticleNavigation(serverType);
	}
}
