package com.news18.ampregressionhomepagebodyvalidation;

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
	 * This method is used to verify the SuperHitGallery title navigation present in the Hindi Home page
	 */
	@Test
	public void superHitGalleryTitle() {
		pages.ampHindiLandingPage.verifySuperHitGalleryTitle(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the SuperHitGallery article navigation in the Hindi  Home page
	 */
	@Test
	public void superHitGalleryArticleLnk() {
		pages.ampHindiLandingPage.verifySuperHitGalleryArticleLnk(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the SuperHitGallery Read more option navigation present in the Hindi
	 * Home page
	 */
	@Test
	public void SuperHitGalleryReadmore() {
		pages.ampHindiLandingPage.verifySuperHitGalleryReadmore(serverType);
	}

}
