package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author
 * This class Contains Test Files for Gujarati Language Lifestyle Section Article  Navigation
 */
public class MobileGujaratiLifestyleWidget extends MobileCommonConfig{

	/**
	 * @author 
	 * This method validates the Lifestyle Article Navigation In Gujarati Homepage
	 */
	@Test
	public void verifyGujaratiHomePageLifeStyleWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifyLifeWidgetArticle(serverType);        
	}
}
