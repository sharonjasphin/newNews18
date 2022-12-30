package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author 
 * This class contains method that validates multiple articles in the consumption page
 */
public class MobileGujaratiInfiniteScroll extends MobileCommonConfig{

	/**
	 * This method is used to validate multiple articles present in the home page
	 */
	@Test
	public void infiniteScroll()
	{
		pages.mobileGujaratiSanityLandingPage.verifyInfiniteScroll(serverType);
	}
}
