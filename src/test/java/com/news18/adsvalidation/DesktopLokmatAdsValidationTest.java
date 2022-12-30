package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Lokmat News18 desktop page
 * 
 */
public class DesktopLokmatAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Lokmat Home page URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat Home Page 
	 */
	@Test
	public void verifyLokmatHomePageAds() {
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat first article Page 
	 */
	@Test
	public void verifyLokmatFirstArticleAds() {
		pages.desktopLokmatLandingPage.clickOnFirstArticleHomePage();      //It will click on First Article Of Lokmat Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat first Live article Page 
	 */
	@Test
	public void verifyLokmatFirstLiveArticleAds() {
		pages.desktopLokmatLandingPage.clickOnLiveBlogArticleHomePage();     //It will click on First Live blog Article Of Lokmat Home Page
		pages.desktopAdsValidation.verifyAds(15000);      //It will verify advertisements is displayed 
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Lokmat photo section Page 
	 */
	@Test
	public void verifyLokmatPhotoSectionPageAds() {
		pages.desktopLokmatLandingPage.clickOnPhotosSection();      //It will click on photo section Of Lokmat Home Page
		pages.desktopLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;//It will click on First photo Article Of English photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

}
