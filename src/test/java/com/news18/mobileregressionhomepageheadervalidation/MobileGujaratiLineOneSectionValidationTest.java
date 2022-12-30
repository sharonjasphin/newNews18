package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the  MObile line One Sections Present at the Header Part of Mobile English HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class MobileGujaratiLineOneSectionValidationTest extends MobileCommonConfig {
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Gujarati News18 HomePage
	 */
	@Test
	public void lineOneSectionValidation () {
		pages.mobileGujaratiLandingPage.verfyLineOneSectionAndSearchIcon();
	}
}
