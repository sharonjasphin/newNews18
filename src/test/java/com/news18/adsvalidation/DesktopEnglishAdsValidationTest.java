package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for English News18 desktop page
 * 
 */
public class DesktopEnglishAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English Home Page 
	 */
	@Test
	public void verifyEnglishHomePageAds() {
		pages.desktopAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English photo section Page 
	 */
	@Test
	public void verifyEnglishPhotoSectionPageAds() {
		pages.desktopLandingPage.clickOnPhotosSection();        //It will click on photo section Of English Home Page
		pages.desktopphotoGalleryConsumptionPage.navigateToOldPhotogalleryFirstArticle();//It will click on First photo Article Of English photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();          //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English first article Page 
	 */
	@Test
	public void verifyEnglishFirstArticleAds() {
		pages.desktopLandingPage.clickOnFirstArticleHomePage();       //It will click on First Article Of English Home Page
		pages.desktopAdsValidation.verifyAds();         //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English first Live Blog article Page 
	 */
	@Test
	public void verifyEnglishFirstLiveBlogArticleAds() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();       //It will click on First Live blog Article Of English Home Page
		pages.desktopAdsValidation.verifyAds(10000);         //It will verify advertisements is displayed 
	}
}