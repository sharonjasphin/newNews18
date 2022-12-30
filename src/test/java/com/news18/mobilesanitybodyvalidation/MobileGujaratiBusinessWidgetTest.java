package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Business Section Article  Navigation
 */
public class MobileGujaratiBusinessWidgetTest extends MobileCommonConfig {

	/**
	 * @author 
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Business Widget Article
	 */
	@Test
	public void verifyGujaratiHomePageBusinessWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifyBusinessWidgetArticle(serverType);        
	}
	

}
