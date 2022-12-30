package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiLineTwoSection extends DesktopCommonConfig{

	
	@Test
	public void lineTwoSection() {
		pages.desktopHindiSanityLandingPage.verfyLineTwoSection(serverType);
	}
}
