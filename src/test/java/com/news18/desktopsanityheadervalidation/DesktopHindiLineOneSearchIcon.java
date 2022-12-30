package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiLineOneSearchIcon extends DesktopCommonConfig{

	@Test
	public void lineOneSection() {
		pages.desktopHindiSanityLandingPage.verfyLineOneSearchIconAndWatchTv();
	}

	
}
