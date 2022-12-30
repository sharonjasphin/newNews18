package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This test Class contains scripts to verify the navigation of India widget article ,Image and More Link
 */
public class DesktopEnglishHomePageIndiaWidget extends DesktopCommonConfig {

	/**
	 * @author 
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	

	
	/**
	 * @author 
	 * This method is used to validate navigation of India Widget Article
	 */
	@Test
	public void verifyEnglishHomePageIndiaWidgetArticle() {
		pages.desktopSanityLandingPage.verifyIndiaWidgetArticle(this.serverType);        
	}
	


}
