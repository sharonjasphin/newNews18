package com.news18.mobilesanitybodyvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author 
 * This test class contains the test files to validate the photo aricle section navigation
 */
public class MobileGujaratiPhotosWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of Photos Widget Article
	 */
	@Test
	public void verifyGujaratiHomePagePhotosWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifyPhotosWidgetArticle(serverType);        
	}

	
	
}
