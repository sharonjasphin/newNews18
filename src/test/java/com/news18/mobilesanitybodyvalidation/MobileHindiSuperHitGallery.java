package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiSuperHitGallery extends MobileCommonConfig{

//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}	
	/**
	 * @author 
	 * This method is used to verify the SuperHitGallery article navigation in the Hindi  Home page
	 */
	@Test
	public void superHitGalleryArticleLnk() {
		pages.mobileHindiSanityLandingPage.verifySuperHitGalleryArticleLnk(serverType);
	}
}
