package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the line One Sections Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * 
 */
public class DesktopKannadaLineOneChooseYourDistrictValidationTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Choose Your District In Gujarati News18 HomePage
	 */
	@Test
	public void verifyLineOneSectionRajyaSeherChune () {
		pages.desktopKannadaLandingPage.verifyLineOneSectionChooseYourDistrict(serverType);
	}
}
