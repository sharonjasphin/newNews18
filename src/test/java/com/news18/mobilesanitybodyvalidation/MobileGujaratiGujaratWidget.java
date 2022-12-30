package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Cities Section Article  Navigation
 */
public class MobileGujaratiGujaratWidget extends MobileCommonConfig{

	/**
	 * @author 
	 * This method validates the Cities Article Navigation In Gujarati Homepage
	 */
	@Test
	public void verifyCitiesArticlesNavigation()
	{
		pages.mobileGujaratiSanityLandingPage.verifyGujaratCitiesNavigation(serverType);
	}
	
}
