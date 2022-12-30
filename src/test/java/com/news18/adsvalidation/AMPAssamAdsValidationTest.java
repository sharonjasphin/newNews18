package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Assam News18 AMP page
 * 
 */
public class AMPAssamAdsValidationTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Assam Home page URL which is fetching from Property File
	 * URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
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
	 * This method is used to validate advertisement is displayed on News18 Assam Home Page 
	 */
//	@Test
//	public void verifyAssamHomePageAds() {
//		changeToAmpURL();
//		pages.mobileAdsValidation.verifyAds();       //It will verify advertisements is displayed 
//	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam First Article Page 
	 */
	@Test
	public void verifyAssamFirstArticlePageAds() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();    //It will click on First Article Of Assam Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAMPAds(6,8000);      //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam photo section Page 
	 */
	@Test
	public void verifyAssamPhotoSectionPageAds() {
		pages.mobileAssamLandingPage.clickOnPhotoSection();       //It will click on photo section Of Assam Home Page
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}
}