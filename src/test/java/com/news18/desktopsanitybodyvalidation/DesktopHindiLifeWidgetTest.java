package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiLifeWidgetTest extends DesktopCommonConfig{

	/**
	 * @author 
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}

	/**
	 * @author 
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test
	public void verifyHindiHomePageLifeWidgetArticle() {
		pages.desktopHindiSanityLandingPage.verifyLifeWidgetArticle(serverType);        
	}

}
