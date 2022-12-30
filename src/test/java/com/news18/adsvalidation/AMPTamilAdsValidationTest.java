package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Tamil News18 AMP page
 * 
 */
public class AMPTamilAdsValidationTest extends MobileCommonConfig{

//	/**
//	 * @author AnupamGupta
//	 * This method is used for navigate to Tamil Home page URL which is fetching from Property File
//	 * URL-https://tamil.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToTamilHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
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
	 * This method is used to validate advertisement is displayed on News18 tamil Home Page 
	 */
//	@Test
//	public void verifyTamilHomePageAds() {
//		changeToAmpURL();
//		pages.mobileAdsValidation.verifyAds();       //It will verify advertisements is displayed 
//	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil First Article Page 
	 */
	@Test
	public void verifyTamilFirstArticlePageAds() {
		pages.mobileTamilLandingPage.clickOnFirstArticleTamilHomePage();    //It will click on First Article Of Tamil Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}



	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil photo section Page 
	 */
	@Test
	public void verifyTamilPhotoSectionPageAds() {
		pages.mobileTamilLandingPage.clickOnPhotoSection();       //It will click on photo section Of Tamil Home Page
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}
}