package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Naukri section navigation present in 
 * the Home page
 */
public class AMPHindiJobSection extends MobileCommonConfig{
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
	 * This method is used to verify the jobsTitle test section present at the RHS of the Home page
	 */
	@Test
	public void jobsTitleNavigation() {
		pages.ampHindiLandingPage.verifyJobsTitle(serverType);
	}
	
	/**
	 * This method is used to verify the jobArticleNavigation test section present at the RHS of the Home page
	 */	
	@Test
	public void jobArticleNavigation() {
		pages.ampHindiLandingPage.verifyJobArticleList(serverType);
	}
}
