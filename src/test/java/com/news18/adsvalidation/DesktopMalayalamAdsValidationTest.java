package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Malayalam News18 desktop page
 * 
 */
public class DesktopMalayalamAdsValidationTest extends DesktopCommonConfig {

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
	 * This method is used to validate advertisement is displayed on News18 Malayalam Home Page 
	 */
	@Test
	public void verifyMalayalamHomePageAds() {
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam photo section Page 
	 */
	@Test
	public void verifyMalayalamPhotoSectionPageAds() {
		pages.desktopMalayalamLandingPage.clickOnPhotosSection();      //It will click on photo section Of Malayalam Home Page
		pages.desktopMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam first article Page 
	 */
	@Test
	public void verifyMalayalamFirstArticleAds() {
		pages.desktopMalayalamLandingPage.clickOnFirstArticleHomePage();     //It will click on First Article Of Malayalam Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Malayalam first Live Blog article Page 
	 */
	@Test
	public void verifyMalayalamFirstLiveBlogArticleAds() {
		pages.desktopMalayalamLandingPage.clickOnLiveBlogArticleHomePage();     //It will click on First Live blog Article Of Malayalam Home Page
		pages.desktopAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}
}
