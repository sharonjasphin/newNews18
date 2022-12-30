package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiLineOneSection extends DesktopCommonConfig{

	@Test
	public void lineOneSection() {
		pages.desktopHindiSanityLandingPage.verfyLineOneSection(serverType);
	}

	
}
