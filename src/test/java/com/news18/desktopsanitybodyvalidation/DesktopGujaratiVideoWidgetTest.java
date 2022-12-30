package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Video Section Article Navigation
 */
public class DesktopGujaratiVideoWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of Video Widget Article
	 */
	@Test
	public void verifyGujaratiHomePageVideoWidgetArticle() {
		pages.desktopGujaratiSanityLandingPage.verifyVideoWidgetArticle(serverType);        
	}
	
	
	
}
