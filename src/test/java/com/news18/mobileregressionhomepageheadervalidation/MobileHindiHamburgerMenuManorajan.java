package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Hamburger Menu Header Section Present after Clicking On Hamburger Icon Present 
 * on Mobile Hindi HomePage.
 * @author DanishR
 */
public class MobileHindiHamburgerMenuManorajan extends MobileCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	/**
	 * @author DanishR
	 * This method is used to validate Manoranjan Present In Hamburger Menu of Mobile Hindi Home Page.
	 */
	@Test
	public void hamburgerMenuManoranjanValidation () {
		pages.mobileHindiLandingPage.hamburgerMenuManoranjanLinks(serverType);
	}
}
