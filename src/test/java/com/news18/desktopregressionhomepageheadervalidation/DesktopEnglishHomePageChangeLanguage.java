package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validates Desktop English HomePage Change Language section
 */
public class DesktopEnglishHomePageChangeLanguage extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to English News18 Home Page URL which is fetched from Property File
	 * URL-https://news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("engBeta"));
	}
	
	/**
	 * This method is used to validate Home Page Change Language Section 
	 */
	@Test
	public void changeLanguage() {
		pages.desktopLandingPage.verifyChangeLanguage();
	}
}

