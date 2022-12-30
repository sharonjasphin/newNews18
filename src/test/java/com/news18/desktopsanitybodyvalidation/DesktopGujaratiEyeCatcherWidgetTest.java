package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Eye catcher Section Article and Image Navigation
 */
public class DesktopGujaratiEyeCatcherWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}

	/**
	 * @author 
	 * This method is used to validate navigation of EyeCatcher Widget Article
	 */
	@Test
	public void verifyGujaratiHomePageEyeCatcherWidgetArticle() {
		pages.desktopGujaratiSanityLandingPage.verifyEyeCatcherWidgetArticle(this.serverType);        
	}

}
