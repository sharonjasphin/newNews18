package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author 
 * This class Contains Test Files for Gujarati Language Sport Section Article Navigation
 */
public class MobileGujaratiSportWidgetTest extends MobileCommonConfig{

	/**
	 * @author 
	 * This method validates the Sport Article Navigation In Gujarati Homepage
	 */
	@Test
	public void verifyGujaratiHomePageSportWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifySportWidgetArticle(serverType);        
	}
}
