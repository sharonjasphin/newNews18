package com.news18.mobilesanitybodyvalidation;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Entertainment Section Article  Navigation
 */import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiEntertainmentWidgetTest extends MobileCommonConfig{

	/**
	 * @author 
	 * This method validates the Entertainment Article Navigation In Gujarati Homepage
	 */
	@Test
	public void verifyGujaratiEntertainmentWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifyEntertainmentWidgetArticle(serverType);        
	}
	
}

