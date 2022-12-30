package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiInfiniteScroll extends DesktopCommonConfig{

	@Test
	public void infiniteScroll() {
		pages.desktopHindiSanityLandingPage.verifyInfiniteScroll(serverType);
	}
}
