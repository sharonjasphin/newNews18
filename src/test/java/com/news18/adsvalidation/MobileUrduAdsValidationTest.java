package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for urdu News18 mobile page
 * 
 */
public class MobileUrduAdsValidationTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Urdu Home page URL which is fetching from Property File
	 * URL-https://urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToUrduHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Urdu Home Page 
	 */
	@Test
	public void verifyUrduHomePageAds() {
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Urdu First Article Page 
	 */
	@Test
	public void verifyUrduFirstArticlePageAds() {
		pages.urduMobileLandingPage.clickOnFirstArticleUrduHomePage();      //It will click on First Article Of Urdu Home Page
		pages.mobileAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Urdu photo section Page 
	 */
	@Test
	public void verifyUrduPhotoSectionPageAds() {
		pages.urduMobileLandingPage.clickOnPhotoSection();      //It will click on photo section Of Urdu Home Page
		pages.mobileUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyMobileAds(5,8000);        //It will verify advertisements is displayed 
	}
}
