package com.news18.desktopregressionhomepageheadervalidation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class validates Desktop Hindi HomePage Social Share Icons
 */
public class DesktopHindiHomePageSocialShare extends DesktopCommonConfig {

	protected static List<WebElement> list1 = new ArrayList<>();

	/**
	 * This method is used to navigate to Hindi News18 Home Page URL which is fetched from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}


	/**
	 * This method is used to validate Social Media links present on HomePage Header
	 */
	@Test
	public void headerSocialShare() {
		pages.desktopHindiLandingPage.verifySocialMedia();
	}

}
