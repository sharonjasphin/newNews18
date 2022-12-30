package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Hindi News18 mobile page
 * 
 */
public class MobileHindiAdsValidationTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Hindi Home Page 
	 */
	@Test
	public void verifyHindiHomePageAds() {
		pages.mobileAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Hindi First Article Page 
	 */
	@Test
	public void verifyHindiFirstArticlePageAds() {
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();    //It will click on First Article Of Hindi Home Page
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Hindi First Live Blog Article Page 
	 */
	@Test
	public void verifyHindiFirstLiveArticlePageAds() {
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();     //It will click on First Live blog Article Of Hindi Home Page
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Hindi photo section Page 
	 */
	@Test
	public void verifyHindiPhotoSectionPageAds() {
		pages.mobileHindiLandingPage.clickOnPhotoSection();      //It will click on photo section Of Hindi Home Page
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed 
	}


}
