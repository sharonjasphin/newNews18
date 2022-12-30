package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiHamburgerLanguage extends MobileCommonConfig{

	@Test
	public void hamburgerLanguageSection()
	{
		pages.mobileGujaratiLandingPage.verifyHamburgerLanguageSection(serverType);
	}
	
	@Test
	public void hamburgerSectionNavigation()
	{
		pages.mobileGujaratiLandingPage.verifyHamburgerSectionNavigation(serverType);
	}
}
