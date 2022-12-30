package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of Movies widget article ,Image and More Link
 */
public class MobileEnglishHomePageMoviesWidget extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Movies Widget Image
	 */
	@Test
	public void verifyEnglishHomePageMoviesWidgetImg() {
		pages.mobileLandingPage.verifyMoviesWidgetImg(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Article
	 */
	@Test
	public void verifyEnglishHomePageMoviesWidgetArticle() {
		pages.mobileLandingPage.verifyMoviesWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Movies News
	 */
	@Test
	public void verifyEnglishHomePageMoviesWidgetMoreLnk() {
		pages.mobileLandingPage.verifyMoreMoviesLnk(this.serverType);        
	}

}
