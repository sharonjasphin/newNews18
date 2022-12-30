package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the line One Hamburger Sections Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class DesktopGujaratiLineOneHamburgerMenuValidationTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Hamburger Menu Validation present at the Header Part In English News18 HomePage
	 */
	@Test
	public void hamburgerMenuValidation () {
		pages.desktopGujaratiLandingPage.verfyLineOneHamburgerMenu(serverType);
	}

}
