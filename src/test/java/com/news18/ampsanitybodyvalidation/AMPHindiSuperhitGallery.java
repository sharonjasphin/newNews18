package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiSuperhitGallery extends MobileCommonConfig{

//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the SuperHitGallery article navigation in the Hindi  Home page
	 */
	@Test
	public void superHitGalleryArticleLnk() {
		pages.ampHindiSanityLandingPage.verifySuperHitGalleryArticleLnk(serverType);
	}
}
