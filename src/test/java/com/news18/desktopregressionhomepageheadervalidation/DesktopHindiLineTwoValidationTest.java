package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the line Two Sections Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class DesktopHindiLineTwoValidationTest extends DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections present under Line One section In Hindi News18 HomePage
	 */
	@Test
	public void lineTwoSectionValidation () {
		pages.desktopHindiLandingPage.verfyLineTwoSection(serverType);
	}
}
