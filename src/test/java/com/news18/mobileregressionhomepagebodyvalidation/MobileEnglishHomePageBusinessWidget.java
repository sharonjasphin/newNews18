package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of Business widget article ,Image and More Link
 */
public class MobileEnglishHomePageBusinessWidget extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Image
	 */
	@Test
	public void verifyEnglishHomePageBusinessWidgetImg() {
		pages.mobileLandingPage.verifyBusinessWidgetImg(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	@Test
	public void verifyEnglishHomePageBusinessWidgetArticle() {
		pages.mobileLandingPage.verifyBusinessWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	@Test
	public void verifyEnglishHomePageBusinessWidgetMoreLnk() {
		pages.mobileLandingPage.verifyMoreBusinessLnk(this.serverType);        
	}

}
