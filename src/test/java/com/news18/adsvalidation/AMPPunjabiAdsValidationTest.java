package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Punjabi News18 AMP page
 * 
 */
public class AMPPunjabiAdsValidationTest extends MobileCommonConfig {

//	/**
//	 * @author AnupamGupta
//	 * This method is used for navigate to Punjabi Home page URL which is fetching from Property File
//	 * URL-https://punjab.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToPunjabiHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
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
	 * This method is used to validate advertisement is displayed on News18 Punjabi Home Page 
	 */
//	@Test
//	public void verifyPunjabiHomePageAds() {
//		changeToAmpURL();
//		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
//	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi First Article Page 
	 */
	@Test
	public void verifyPunjabiFirstArticlePageAds() {
		pages.mobilePunjabLandingPage.clickOnFirstArticlePunjabHomePage();     //It will click on First Article Of Punjabi Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi photo section Page 
	 */
	@Test
	public void verifyPunjabiPhotoSectionPageAds() {
		pages.mobilePunjabLandingPage.clickOnPhotoSection();     //It will click on photo section Of Punjabi Home Page
		pages.mobilePunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}
}