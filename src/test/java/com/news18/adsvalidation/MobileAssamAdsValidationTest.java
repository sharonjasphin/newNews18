package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Assam News18 mobile page
 * 
 */
public class MobileAssamAdsValidationTest extends MobileCommonConfig {

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
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam Home Page 
	 */
	@Test
	public void verifyAssamHomePageAds() {
		pages.mobileAdsValidation.verifyAds(6,8000);       //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam First Article Page 
	 */
	@Test
	public void verifyAssamFirstArticlePageAds() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();    //It will click on First Article Of Assam Home Page
		pages.mobileAdsValidation.verifyMobileAds(6,8000);      //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam photo section Page 
	 */
	@Test(priority = -1)
	public void verifyAssamPhotoSectionPageAds() {
		pages.mobileAssamLandingPage.clickOnPhotoSection();       //It will click on photo section Of Assam Home Page
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyMobileAds(6,8000);      //It will verify advertisements is displayed 
	}
}
