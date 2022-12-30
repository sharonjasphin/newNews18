package com.news18.mobilesanityheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the  MObile line One Sections Present at the Header Part of Mobile English HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class MobileHindiLineOneSectionValidationTest extends MobileCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void lineOneSectionValidation () {
		pages.mobileHindiSanityLandingPage.verfyLineOneSection(serverType);
	}
}
