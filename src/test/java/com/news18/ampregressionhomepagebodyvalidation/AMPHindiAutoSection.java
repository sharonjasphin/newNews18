package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the script to validate the Auto Section Navigation present 
 *in the Hindi home page
 */
public class AMPHindiAutoSection extends MobileCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinAmpBeta"));
	}
	
	/**
	 * This method is used to verify the AutoSectionHeadline present in the Home page of AMP view
	 */
	@Test
	public void autoSectionHeadline() {
		pages.ampHindiLandingPage.verifyautoSectionHeadline(serverType);
	}
	

	/**
	 * This method is used to verify the autoArticleNavigation present in the Home page of AMP view
	 */
	@Test
	public void autoArticleNavigation() {
		pages.ampHindiLandingPage.verifyAutoArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the autoReadMore present in the Home page of AMP view
	 */
   @Test
	public void autoReadMore() {
		pages.ampHindiLandingPage.verifyAutoReadMore(serverType);
	}
}
