package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Health and fitness section present in the RHS 
 *of the Home page
 */
public class AMPHindiHealthSection extends MobileCommonConfig{
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
	 * This method is used to verify the HealthArticleNavigation test section present at the RHS of the Home page
	 */
	@Test
	public void healthArticleNavigation() {
		pages.ampHindiSanityLandingPage.verifyhealthArticleNavigation(serverType);
	}
}
