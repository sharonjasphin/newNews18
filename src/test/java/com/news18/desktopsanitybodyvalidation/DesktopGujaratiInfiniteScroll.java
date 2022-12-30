package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author 
 * This class contains method that validates multiple articles in the consumption page
 */
public class DesktopGujaratiInfiniteScroll extends DesktopCommonConfig{

	/**
	 * This method is used to validate multiple articles present in the home page
	 */
	@Test
	public void infiniteScroll() {
		pages.desktopGujaratiSanityLandingPage.verifyInfiniteScroll(serverType);
	}
}
