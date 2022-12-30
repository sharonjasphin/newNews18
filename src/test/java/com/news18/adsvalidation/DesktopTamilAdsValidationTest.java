package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Tamil News18 desktop page
 * 
 */
public class DesktopTamilAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Tamil Home page URL which is fetching from Property File
	 * URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil Home Page 
	 */
	@Test
	public void verifyTamilHomePageAds() {
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil photo section Page 
	 */
	@Test
	public void verifyTamilPhotoSectionPageAds() {
		pages.desktopTamilLandingPage.clickOnPhotosSection();      //It will click on photo section Of Tamil Home Page
		pages.desktopTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil first article Page 
	 */
	@Test
	public void verifyTamilFirstArticleAds() {
		pages.desktopTamilLandingPage.clickOnFirstArticleHomePage();      //It will click on First Article Of Tamil Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Tamil first Live Blog article Page 
	 */
	@Test
	public void verifyTamilFirstLiveBlogArticleAds() {
		pages.desktopTamilLandingPage.clickOnLiveBlogArticleHomePage();      //It will click on First Article Live blog Of Tamil Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed 
	}
}
