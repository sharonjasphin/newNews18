package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author
 * This class Contains Test Files for Gujarati Language DharmBhakti Section Article  Navigation
 */
public class MobileGujaratiDharmBhakti extends MobileCommonConfig{
	

	/**
	 * @author 
	 * This method validates the DharamBhakti Article Navigation In Gujarati Homepage
	 */
	@Test
	public void dharamBhaktiArticleNavigation()
	{
		pages.mobileGujaratiSanityLandingPage.verifyDharamBhaktiArticleNavigation(serverType);
	}

}
