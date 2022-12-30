package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Lifestyle Section Article Navigation
 */
public class DesktopGujaratiLifeStyleWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test
	public void verifyGujaratiHomePageLifeStyleWidgetArticle() {
		pages.desktopGujaratiSanityLandingPage.verifyLifeWidgetArticle(serverType);        
	}
	
	

}
