package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiInfiniteScroll extends MobileCommonConfig{

	@Test
	public void infiniteScroll() {
		pages.mobileHindiSanityLandingPage.verifyInfiniteScroll(serverType);
	}
}
