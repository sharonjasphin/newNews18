package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Gujarati News18 mobile page
 * 
 */
public class AMPGujaratiAdsValidationTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 * URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}


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
	 * This method is used to validate advertisement is displayed on News18 Gujarati Home Page 
	 */
//	@Test
//	public void verifyGujaratiHomePageAds() {
//		changeToAmpURL();
//		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
//	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati First Article Page 
	 */
	@Test
	public void verifyGujaratiFirstArticlePageAds() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();     //It will click on First Article Of Gujarati Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAMPAds(6,8000);      //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati First Live Blog Article Page 
	 */
	@Test
	public void verifyGujaratiFirstLiveArticlePageAds() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();     //It will click on First Live blog Article Of Gujarati Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAMPAds(6,8000);      //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati photo section Page 
	 */
	@Test
	public void verifyGujaratiPhotoSectionPageAds() {
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();     //It will click on photo section Of Gujarati Home Page
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}
}