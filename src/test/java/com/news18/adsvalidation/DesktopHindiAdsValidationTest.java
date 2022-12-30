package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Hindi News18 desktop page
 * 
 */
public class DesktopHindiAdsValidationTest extends DesktopCommonConfig {

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
		pages.desktopAdsValidation.verifyAds();          //It will verify advertisements is displayed 
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Hindi first article Page 
	 */
	@Test
	public void verifyHindiFirstArticleAds() {
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();       //It will click on First Article Of Hindi Home Page
		pages.desktopAdsValidation.verifyAds();         //It will verify advertisements is displayed 
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Hindi first Live article Page 
	 */
	@Test
	public void verifyHindiFirstLiveArticleAds() {
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();      //It will click on First Live blog Article Of Hindi Home Page
		pages.desktopAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Hindi photo section Page 
	 */
	@Test
	public void verifyHindiPhotoSectionPageAds() {
		pages.desktopHindiLandingPage.clickOnPhotoSection();      //It will click on photo section Of Hindi Home Page
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}
}
