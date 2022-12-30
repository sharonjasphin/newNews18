package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileKannadaHamburgerSectionValidationTest extends MobileCommonConfig{

	@Test
	public void hamburgerSection()
	{
		pages.mobileKannadaLandingPage.verifyHamburgerSection();
	}
}
