package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author 
 *This test class contains the script to validate the Auto Section Navigation present 
 *in the Hindi home page
 */
public class MobileHindiAutoSection extends MobileCommonConfig{
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
	 * This method is used to verify the auto article navigation present at the Hindi Home page
	 */
	@Test
	public void autoArticleNavigation() {
		pages.mobileHindiSanityLandingPage.verifyAutoArticleNavigation(serverType);
	}
}
