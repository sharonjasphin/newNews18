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
public class MobileGujaratiAdsValidationTest extends MobileCommonConfig {

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
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati Home Page 
	 */
	@Test
	public void verifyGujaratiHomePageAds() {
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati First Article Page 
	 */
	@Test
	public void verifyGujaratiFirstArticlePageAds() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();     //It will click on First Article Of Gujarati Home Page
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati First Live Blog Article Page 
	 */
	@Test
	public void verifyGujaratiFirstLiveArticlePageAds() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();     //It will click on First Live blog Article Of Gujarati Home Page
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati photo section Page 
	 */
	@Test
	public void verifyGujaratiPhotoSectionPageAds() {
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();     //It will click on photo section Of Gujarati Home Page
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds(6,8000);      //It will verify advertisements is displayed
	}
}
