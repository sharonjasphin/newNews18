package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author
 * This class Contains Test Files for Gujarati Language Eyecatcher Section Article  Navigation
 */
public class MobileGujaratiEyeCatcherWidgetTest extends MobileCommonConfig{

	/**
	 * @author 
	 * This method validates the Eyecatcher Article Navigation In Gujarati Homepage
	 */
	@Test
	public void verifyGujaratiHomePageEyeCatcherWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifyEyeCatcherWidgetArticle(serverType);        
	}
}
