package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Tamil News18 mobile page
 * 
 */
public class MobileTamilAdsValidationTest extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Tamil Home page URL which is fetching from Property File
	 * URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 tamil Home Page 
	 */
	@Test
	public void verifyTamilHomePageAds() {
		pages.mobileAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil First Article Page 
	 */
	@Test
	public void verifyTamilFirstArticlePageAds() {
		pages.mobileTamilLandingPage.clickOnFirstArticleTamilHomePage();    //It will click on First Article Of Tamil Home Page
		pages.mobileAdsValidation.verifyTamilAds(6,8000);       //It will verify advertisements is displayed 
	}
	
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil photo section Page 
	 */
	@Test
	public void verifyTamilPhotoSectionPageAds() {
		pages.mobileTamilLandingPage.clickOnPhotoSection();       //It will click on photo section Of Tamil Home Page
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}

}
