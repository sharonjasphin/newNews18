package com.news18.desktopregressionhomepagefootervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *  * This Class Contains scripts to verify the  footer Section elements Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 */
public class DesktopKannadaFooterSocialShareSectionValidationTest extends DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Group Sites Sections present In Gujarati News18 HomePage
	 */
	@Test
	public void footerSocialSectionSectionValidation () {
		pages.desktopKannadaLandingPage.verifyFooterSocialShareSection();
	}
}
