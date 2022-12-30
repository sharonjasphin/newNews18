package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiLiveBlogTest extends DesktopCommonConfig{
	/**
	 * @author 
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	@Test
	public void LiveBlogHeadline () {
		pages.desktopHindiSanityLandingPage.verfyLiveBlogHeadline(serverType);
	}
}
