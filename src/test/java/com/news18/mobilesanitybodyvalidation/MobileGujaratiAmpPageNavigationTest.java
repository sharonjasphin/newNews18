package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author 
 * This Test Class contains scripts for Verification of Gujarati Amp URL
 * by Navigating and getting Amp Url from view page Source Code page and Url should open in amp view
 * URL- https://betagujarati.news18.com/
 */
public class MobileGujaratiAmpPageNavigationTest extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to validate Articles Navigation in Amp View
	 * Gujarati Home Page by taking The Help Of Amp Validator 
	 */
	@Test
	public void ampUrlNavigation() {
		pages.mobileGujaratiSanityLandingPage.ampPageNavigation(serverType);
	}

}
