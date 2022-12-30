package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishHomePageDownloadApp extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to English News18 Home Page URL which is fetched from Property File
	 * URL-https://news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * This method is used to validate Download App link present in HomePage Header
	 */
	@Test
	public void downloadApp() {
		pages.desktopLandingPage.verifyDownloadApp(serverType);
	}

}
