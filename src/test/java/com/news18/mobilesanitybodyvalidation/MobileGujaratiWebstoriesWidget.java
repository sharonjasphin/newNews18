package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author 
 * This class Contains Test Files for Gujarati Language Webstories Section Article Navigation
 */
public class MobileGujaratiWebstoriesWidget extends MobileCommonConfig{

	/**
	 * @author 
	 * This method validates the Webstories Article Navigation In Gujarati Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.mobileGujaratiSanityLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}
}
