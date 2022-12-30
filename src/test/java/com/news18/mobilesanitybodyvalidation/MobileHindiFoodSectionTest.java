package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author ]
 *This test class contains the methods to validate the Food section articles navogation
 *present at the RHS of the Home page
 */
public class MobileHindiFoodSectionTest extends MobileCommonConfig{
	
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
	 * This method is used to verify the Food article navigation present in the HindiHome page 
	 */
	@Test
	public void foodArticleNavigation() {
		pages.mobileHindiSanityLandingPage.verifyFoodArticleNavigation(serverType);
	}	
}
