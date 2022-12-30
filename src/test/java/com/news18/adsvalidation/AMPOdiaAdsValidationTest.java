package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Odia News18 AMP page
 * 
 */
public class AMPOdiaAdsValidationTest extends MobileCommonConfig {
 
//	/**
//	 * @author AnupamGupta
//	 * This method is used for navigate to Odia Home page URL which is fetching from Property File
//	 * URL-https://odia.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToOdiaHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
//	}
	
	
	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Odia Home Page 
	 */
//	@Test
//	public void verifyOdiaHomePageAds() {
//		changeToAmpURL();
//		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
//	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Odia First Article Page 
	 */
	@Test
	public void verifyOdiaFirstArticlePageAds() {
		pages.mobileOdiaLandingPage.clickOnFirstArticleOdiaHomePage();      //It will click on First Article Of Odia Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Odia photo section Page 
	 */
	@Test
	public void verifyOdiaPhotoSectionPageAds() {
		pages.mobileOdiaLandingPage.clickOnPhotosSection();   //It will click on photo section Of Odia Home Page
		pages.mobileOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();       //It will verify advertisements is displayed
	}
}