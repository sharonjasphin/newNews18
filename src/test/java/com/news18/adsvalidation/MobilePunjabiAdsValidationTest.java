package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Punjabi News18 mobile page
 * 
 */
public class MobilePunjabiAdsValidationTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Punjabi Home page URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi Home Page 
	 */
	@Test
	public void verifyPunjabiHomePageAds() {
		pages.mobileAdsValidation.verifyAds(6,8000);     //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi First Article Page 
	 */
	@Test
	public void verifyPunjabiFirstArticlePageAds() {
		pages.mobilePunjabLandingPage.clickOnFirstArticlePunjabHomePage();     //It will click on First Article Of Punjabi Home Page
		pages.mobileAdsValidation.verifyAds(6,8000);     //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi photo section Page 
	 */
	@Test
	public void verifyPunjabiPhotoSectionPageAds() {
		pages.mobilePunjabLandingPage.clickOnPhotoSection();     //It will click on photo section Of Punjabi Home Page
		pages.mobilePunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds(6,8000);     //It will verify advertisements is displayed
	}
}
