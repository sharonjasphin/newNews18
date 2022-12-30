package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class AMPHindiNewStack  extends MobileCommonConfig{

	@Test
	public void homePageNewStack() {
		pages.ampHindiSanityLandingPage.verifyHomepageNewStack();
	}
	
	@Test
	public void photogalleryPageNewStack() {
		pages.ampHindiSanityLandingPage.verifyPhotogalleryPageNewStack();
	}
	@Test
	public void videoPageNewStack() {
		pages.ampHindiSanityLandingPage.verifyVideoPageNewStack();
	}
}
