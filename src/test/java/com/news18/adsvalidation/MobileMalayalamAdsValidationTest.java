package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Malayalam News18 mobile page
 * 
 */
public class MobileMalayalamAdsValidationTest extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Malayalam Home page URL which is fetching from Property File
	 * URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToMalayalamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 malayalam Home Page 
	 */
	@Test
	public void verifyMalayalamHomePageAds() {
		pages.mobileAdsValidation.verifyMobileAds(6,8000);      //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam First Article Page 
	 */
	@Test
	public void verifyMalayalamFirstArticlePageAds() {
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();      //It will click on First Article Of Malayalam Home Page
		pages.mobileAdsValidation.verifyAds(6,8000);      //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam First Live Article Page 
	 */
	@Test
	public void verifyMalayalamFirstLiveArticlePageAds() {
		pages.mobileMalayalamLandingPage.clickOnFirstLiveBlogArticleMalayalamHomePage();  //It will click on First Live blog Article Of Malayalam Home Page
		pages.mobileAdsValidation.verifyAds(6,8000);     //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam photo section Page 
	 */
	@Test
	public void verifyMalayalamPhotoSectionPageAds() {
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();      //It will click on photo section Of Malayalam Home Page
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.mobileAdsValidation.verifyAds(6,8000);     //It will verify advertisements is displayed 
	}

}
