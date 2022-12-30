package com.news18.mobilesanityheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Hamburger Menu Header Section Present after Clicking On Hamburger Icon Present 
 * on Mobile Hindi HomePage.
 * @author DanishR
 */
public class MobileHindiHamburgerMenuDuniya extends MobileCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	/**
	 * @author DanishR
	 * This method is used to validate Duniya Section Present In Hamburger Menu of Mobile Hindi Home Page.
	 */
	@Test
	public void hamburgerMenuDuniyaSection () {
		pages.mobileHindiSanityLandingPage.hamburgerMenuDuniyaSection(serverType);
	}
}
