package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for kannada News18 mobile page
 */
public class MobileKannadaAdsValidationTest extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to kannada Home page URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateTokannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 kannada Home Page 
	 */
	@Test
	public void verifyKannadaHomePageAds() {
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 kannada First Article Page 
	 */
	@Test
	public void verifykannadaFirstArticlePageAds() {
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();     //It will click on First Article Of kannada Home Page
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 kannada photo section Page 
	 */
	@Test
	public void verifykannadaPhotoSectionPageAds() {
		pages.mobileKannadaLandingPage.clickOnPhotoSection();     //It will click on photo section Of kannada Home Page
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}

}
