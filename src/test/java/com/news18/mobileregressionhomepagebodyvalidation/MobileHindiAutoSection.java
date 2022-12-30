package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Sharon
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
	 * This method is used to verify the auto title navigation present at the RHS of the Home page
	 */
	@Test
	public void autoSectionHeadline() {
		pages.mobileHindiLandingPage.verifyautoSectionHeadline(serverType);
	}
	
	/**
	 * This method is used to verify the auto article navigation present at the Hindi Home page
	 */
	@Test
	public void autoArticleNavigation() {
		pages.mobileHindiLandingPage.verifyAutoArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the auto Read more option navigation present at the Hindi
	 * Home page
	 */
	@Test
	public void autoReadMore() {
		pages.mobileHindiLandingPage.verifyAutoReadMore(serverType);
	}

}
