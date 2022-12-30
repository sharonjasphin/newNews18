package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of VideoWall widget article ,Image and More Link
 */
public class MobileEnglishHomePageVideoWallWidget extends MobileCommonConfig {

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
	 * This method is used to validate navigation of VideoWall Widget Image
	 */
	@Test
	public void verifyEnglishHomePageVideoWallWidgetImg() {
		pages.mobileLandingPage.verifyVideoWallImgNavigation(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	@Test
	public void verifyEnglishHomePageVideoWallWidgetArticle() {
		pages.mobileLandingPage.verifyVideoWallArticleNavigation(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of From our shows Widget Article
	 */
	@Test
	public void verifyEnglishHomePageFromOurShowsWidgetArticle() {
		pages.mobileLandingPage.verifyFromOurShowsArticleNavigation(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of From our shows Widget Image
	 */
	@Test
	public void verifyEnglishHomePageFromOurShowsWidgetImg() {
		pages.mobileLandingPage.verifyFromOurShowsImgNavigation(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Jump to show Widget 
	 */
	@Test(priority = 5)
	public void verifyEnglishHomePageJumpToShowShowsWidget() {
		pages.mobileLandingPage.verifyJumpToShowNavigation(this.serverType);        
	}

}
