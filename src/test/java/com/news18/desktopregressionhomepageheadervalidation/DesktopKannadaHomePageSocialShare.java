package com.news18.desktopregressionhomepageheadervalidation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaHomePageSocialShare extends DesktopCommonConfig {

	protected static List<WebElement> list1 = new ArrayList<>();

	/**
	 * This method is used to navigate to Kannada News18 Home Page URL which is fetched from Property File
	 * URL-https://betakannada.news18.com/
	 */
	//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}


	/**
	 * This method is used to validate Social Media links present on HomePage Header
	 */
	@Test
	public void headerSocialShare() {
		pages.desktopKannadaLandingPage.verifySocialMedia();
	}

}
