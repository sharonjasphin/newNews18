package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Odia News18 desktop page
 * 
 */
public class DesktopOdiaAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Odia Home page URL which is fetching from Property File
	 * URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Odia Home Page 
	 */
	@Test
	public void verifyOdiaHomePageAds() {
		pages.desktopAdsValidation.verifyAds(10000);      //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Odia photo section Page 
	 */
	@Test
	public void verifyOdiaPhotoSectionPageAds() {
		pages.desktopOdiaLandingPage.clickOnPhotosSection();     //It will click on photo section Of Odia Home Page
		pages.desktopOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds(10000);     //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Odia first article Page 
	 */
	@Test
	public void verifyOdiaFirstArticleAds() {
		pages.desktopOdiaLandingPage.clickOnFirstArticleHomePage();       //It will click on First Article Of Odia Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Odia first Live Blog article Page 
	 */
	@Test
	public void verifyOdiaFirstLiveBlogArticleAds() {
		pages.desktopOdiaLandingPage.clickOnLiveBlogArticleHomePage();     //It will click on First Live blog Article Of Odia Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}
}
