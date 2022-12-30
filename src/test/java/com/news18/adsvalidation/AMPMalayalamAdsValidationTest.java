package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Malayalam News18 AMP page
 * 
 */
public class AMPMalayalamAdsValidationTest extends MobileCommonConfig{

//	/**
//	 * @author AnupamGupta
//	 * This method is used for navigate to Malayalam Home page URL which is fetching from Property File
//	 * URL-https://malayalam.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToMalayalamHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
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
	 * This method is used to validate advertisement is displayed on News18 malayalam Home Page 
	 */
//	@Test
//	public void verifyMalayalamHomePageAds() {
//		changeToAmpURL();
//		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed 
//	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam First Article Page 
	 */
	@Test
	public void verifyMalayalamFirstArticlePageAds() {
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();      //It will click on First Article Of Malayalam Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam First Live Article Page 
	 */
	@Test
	public void verifyMalayalamFirstLiveArticlePageAds() {
		pages.mobileMalayalamLandingPage.clickOnFirstLiveBlogArticleMalayalamHomePage();  //It will click on First Live blog Article Of Malayalam Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam photo section Page 
	 */
	@Test
	public void verifyMalayalamPhotoSectionPageAds() {
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();      //It will click on photo section Of Malayalam Home Page
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed 
	}
}