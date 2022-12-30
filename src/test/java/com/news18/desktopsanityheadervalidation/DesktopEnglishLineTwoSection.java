package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLineTwoSection extends DesktopCommonConfig{

	
	@Test
	public void lineTwoSection() {
		pages.desktopSanityLandingPage.verfyLineTwoSection(serverType);
	}
}
