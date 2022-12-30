package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Lokmat News18 mobile page
 * 
 */
public class MobileLokmatAdsValidationTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Lokmat Home page URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat Home Page 
	 */
	@Test
	public void verifyLokmatHomePageAds() {
		pages.mobileAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat First Article Page 
	 */
	@Test
	public void verifyLokmatFirstArticlePageAds() {
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();     //It will click on First Article Of Lokmat Home Page
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat First Live Article Page 
	 */
	@Test
	public void verifyLokmatFirstLiveArticlePageAds() {
		pages.mobileLokmatLandingPage.clickOnFirstLiveBlogArticleLokmatHomePage();  //It will click on First Live Blog Article Of Lokmat Home Page
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat photo section Page 
	 */
	@Test
	public void verifyLokmatPhotoSectionPageAds() {
		pages.mobileLokmatLandingPage.clickOnPhotoSection();     //It will click on photo section Of Lokmat Home Page
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed 
	}
}
