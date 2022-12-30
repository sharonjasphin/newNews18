package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Telugu News18 mobile page
 * 
 */
public class MobileTeluguAdsValidationTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Telugu Home page URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Telugu Home Page 
	 */
	@Test
	public void verifyTeluguHomePageAds() {
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Telugu First Article Page 
	 */
	@Test
	public void verifyTeluguFirstArticlePageAds() {
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();      //It will click on First Article Of Telugu Home Page
		pages.mobileAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Telugu photo section Page 
	 */
	@Test
	public void verifyTeluguPhotoSectionPageAds() {
		pages.mobileTeluguLandingPage.clickOnPhotoSection();       //It will click on photo section Of Telugu Home Page
		pages.mobileTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds();         //It will verify advertisements is displayed 
	}
}
