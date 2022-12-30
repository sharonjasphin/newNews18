package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author
 * This class Contains Test Files for Gujarati Language Hambergur Navigation
 */
public class DesktopGujaratiLineOneHambergurMenuValidation extends DesktopCommonConfig{

	/**
	 * @author 
	 * This method is used to validate Hamburger Menu Validation present at the Header Part In English News18 HomePage
	 */
	@Test
	public void hamburgerMenuValidation () {
		pages.desktopGujaratiSanityLandingPage.verfyLineOneHamburgerMenu(serverType);
	}
}
