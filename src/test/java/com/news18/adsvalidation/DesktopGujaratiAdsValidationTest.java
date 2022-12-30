package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Gujarati News18 desktop page
 * 
 */
public class DesktopGujaratiAdsValidationTest extends DesktopCommonConfig {

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
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati photo section Page 
	 */
	@Test
	public void verifyGujaratiPhotoSectionPageAds() {
		pages.desktopGujaratiLandingPage.clickOnPhotosSection();       //It will click on photo section Of Gujarati Home Page
		pages.desktopGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati first article Page 
	 */
	@Test
	public void verifyGujaratiFirstArticleAds() {
		pages.desktopGujaratiLandingPage.clickOnFirstArticleHomePage();      //It will click on First Article Of Gujarati Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Gujarati first Live Blog article Page 
	 */
	@Test
	public void verifyGujaratiFirstLiveBlogArticleAds() {
		pages.desktopGujaratiLandingPage.clickOnLiveBlogArticleHomePage();      //It will click on First Live blog Article Of Gujarati Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed
	}
}