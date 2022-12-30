package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Kannada News18 desktop page
 * 
 */
public class DesktopKannadaAdsValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Kannada Home page URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Kannada Home Page 
	 */
	@Test
	public void verifyKannadaHomePageAds() {
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Kannada photo section Page 
	 */
	@Test
	public void verifyKannadaPhotoSectionPageAds() {
		pages.desktopKannadaLandingPage.clickOnPhotosSection();      //It will click on photo section Of Kannada Home Page
		pages.desktopKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle(); //It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed
	} 

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Kannada first article Page 
	 */
	@Test
	public void verifyKannadaFirstArticleAds() {
		pages.desktopKannadaLandingPage.clickOnFirstArticleHomePage();      //It will click on First Article Of Kannada Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Kannada first Live Blog article Page 
	 */
	@Test
	public void verifyKannadaFirstLiveBlogArticleAds() {
		pages.desktopKannadaLandingPage.clickOnLiveBlogArticleHomePage();    //It will click on First Live blog Article Of Kannada Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}
}
