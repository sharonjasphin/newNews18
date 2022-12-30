package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of India widget article ,Image and More Link
 */
public class AMPEnglishHomePageIndiaWidget extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Image
	 */
	@Test
	public void verifyEnglishHomePageIndiaWidgetImg() {
		pages.ampLandingPage.verifyIndiaWidgetImg(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	@Test
	public void verifyEnglishHomePageIndiaWidgetArticle() {
		pages.ampLandingPage.verifyIndiaWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	@Test
	public void verifyEnglishHomePageIndiaWidgetMoreLnk() {
		pages.ampLandingPage.verifyMoreIndiaLnk(this.serverType);        
	}

}
