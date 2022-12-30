package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of Movies widget article ,Image and More Link
 */
public class AMPEnglishHomePageMoviesWidget extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Movies Widget Image
	 */
	@Test
	public void verifyEnglishHomePageMoviesWidgetImg() {
		pages.ampLandingPage.verifyMoviesWidgetImg(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Article
	 */
	@Test
	public void verifyEnglishHomePageMoviesWidgetArticle() {
		pages.ampLandingPage.verifyMoviesWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Movies News
	 */
	@Test
	public void verifyEnglishHomePageMoviesWidgetMoreLnk() {
		pages.ampLandingPage.verifyMoreMoviesLnk(this.serverType);        
	}

}
