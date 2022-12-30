package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validates Desktop Hindi HomePage Change Language section
 */
public class DesktopHindiHomePageChangeLanguage extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Hindi News18 Home Page URL which is fetched from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("preProd"));
	}
	
	/**
	 * This method is used to validate Home Page Change Language Section 
	 */
	@Test
	public void changeLanguage() {
		pages.desktopHindiLandingPage.verifyChangeLanguage();
	}
}

