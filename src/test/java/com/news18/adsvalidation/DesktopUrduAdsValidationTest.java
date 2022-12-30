package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Urdu News18 desktop page
 * 
 */
public class DesktopUrduAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Urdu Home page URL which is fetching from Property File
	 * URL-https://urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Urdu Home Page 
	 */
	@Test
	public void verifyUrduHomePageAds() {
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Urdu photo section Page 
	 */
	@Test
	public void verifyUrduPhotoSectionPageAds() {
		pages.desktopUrduLandingPage.clickOnPhotosSection();     //It will click on photo section Of Urdu Home Page
		pages.desktopUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();  //It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Urdu first article Page 
	 */
	@Test
	public void verifyUrduFirstArticleAds() {
		pages.desktopUrduLandingPage.clickOnFirstArticleHomePage();     //It will click on First Article Of Urdu Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Urdu first Live Blog article Page 
	 */
	@Test
	public void verifyUrduFirstLiveBlogArticleAds() {
		pages.desktopUrduLandingPage.clickOnLiveBlogArticleHomePage();      //It will click on First Live blog Article Of Urdu Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}
}
