package com.news18.ampsanityheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Hamburger Menu Header Section Present after Clicking On Hamburger Icon Present 
 * on Mobile English HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class AMPEnglishHamburgerSectionValidationTest extends MobileCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for English
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
	//@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Section Drop down Present In Hamburger Menu of AMP English Home Page.
	 */
	@Test
	public void hamburgerMenuSectionValidation () {
		pages.ampSanityLandingPage.verifyHamburgerMenuSectionDropdown(serverType);
	}
}
