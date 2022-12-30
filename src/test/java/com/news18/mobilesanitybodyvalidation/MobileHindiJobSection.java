package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author 
 *This test class contains the methods to validate the Naukri section navigation present in 
 * the Home page
 */
public class MobileHindiJobSection extends MobileCommonConfig{
	
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * This method is used to verify the Naukri section article navigation present in the
	 * the Home page
	 */	
	@Test
	public void jobArticleNavigation() {
		pages.mobileHindiSanityLandingPage.verifyJobArticleList(serverType);
	}
	
}
