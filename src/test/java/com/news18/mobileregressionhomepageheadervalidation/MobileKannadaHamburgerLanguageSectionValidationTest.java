package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileKannadaHamburgerLanguageSectionValidationTest extends MobileCommonConfig{

	@Test
	public void hamburgerLanguageSection()
	{
		pages.mobileKannadaLandingPage.verifyHamburgerLanguageSection();
	}
}
