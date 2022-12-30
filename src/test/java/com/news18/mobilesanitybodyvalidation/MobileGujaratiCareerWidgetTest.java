package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author
 * This class Contains Test Files for Gujarati Language Career Section Article  Navigation
 */
public class MobileGujaratiCareerWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Career Widget Article
	 */
	@Test
	public void verifyGujaratiHomePageCareerWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifyCareerWidgetArticle(serverType);        
	}
	
	
	
}
