package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class validates Desktop Hindi HomePage Trending Topics
 */
public class DesktopHindiHomePageTrendingTopics extends DesktopCommonConfig {
	
	/**
	 * This method is used to navigate to Hindi News18 Home Page URL which is fetched from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * This method is used to validate Trending Topics Home Page Header
	 */
	@Test
	public void headerTrendingTopics() {
		pages.desktopHindiLandingPage.verifyTrendingTopics(serverType);
	}

}
