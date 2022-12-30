package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileGujaratiNewStack  extends MobileCommonConfig{

//	@Test
	public void homePageNewStack() {
		pages.mobileGujaratiSanityLandingPage.verifyHomepageNewStack();
	}
	
//	@Test
	public void tagPageNewStack() {
		pages.mobileGujaratiSanityLandingPage.verifyTagPageNewStack();
	}
//	@Test
	public void photogalleryPageNewStack() {
		pages.mobileGujaratiSanityLandingPage.verifyPhotogalleryPageNewStack();
	}
	@Test
	public void videoPageNewStack() {
		pages.mobileGujaratiSanityLandingPage.verifyVideoPageNewStack();
	}
}
