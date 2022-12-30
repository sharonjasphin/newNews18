package com.news18.mobilesanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiHamburger extends MobileCommonConfig{

	
	@Test
	public void hamburgerSectionNavigation()
	{
		pages.mobileGujaratiSanityLandingPage.verifyHamburgerSectionNavigation(serverType);
	}
}
