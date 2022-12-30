package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of VideoWall widget article ,Image and More Link
 */
public class DesktopEnglishHomePageVideoWallWidget extends DesktopCommonConfig {

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
		pages.desktopLandingPage.verifyVideoWallImgLnk(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	@Test
	public void verifyEnglishHomePageVideoWallWidgetArticle() {
		pages.desktopLandingPage.verifyVideoWallArticleLnk(this.serverType);        
	}


}
