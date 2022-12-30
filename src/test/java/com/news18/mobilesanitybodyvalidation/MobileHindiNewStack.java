package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiNewStack  extends MobileCommonConfig{

	@Test
	public void homePageNewStack() {
		pages.mobileHindiSanityLandingPage.verifyHomepageNewStack();
	}
	
	@Test
	public void tagPageNewStack() {
		pages.mobileHindiSanityLandingPage.verifyTagPageNewStack();
	}
	@Test
	public void photogalleryPageNewStack() {
		pages.mobileHindiSanityLandingPage.verifyPhotogalleryPageNewStack();
	}
	@Test
	public void videoPageNewStack() {
		pages.mobileHindiSanityLandingPage.verifyVideoPageNewStack();
	}
}
