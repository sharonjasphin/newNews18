package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiNewStack  extends DesktopCommonConfig{

	@Test
	public void homePageNewStack() {
		pages.desktopHindiSanityLandingPage.verifyHomepageNewStack();
	}
	
//	@Test
	public void tagPageNewStack() {
		pages.desktopHindiSanityLandingPage.verifyTagPageNewStack();
	}
	@Test
	public void photogalleryPageNewStack() {
		pages.desktopHindiSanityLandingPage.verifyPhotogalleryPageNewStack();
	}
	@Test
	public void videoPageNewStack() {
		pages.desktopHindiSanityLandingPage.verifyVideoPageNewStack();
	}
}
