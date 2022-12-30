package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Bengali News18 desktop page
 *
 */
public class DesktopBengaliAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Bengali Home page URL which is fetching from Property File
	 * URL-https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Bengali Home Page 
	 */
	@Test
	public void verifyBengaliHomePageAds() {
		pages.desktopAdsValidation.verifyAds();        //It will verify advertisements is displayed
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Bengali first article Page 
	 */
	@Test
	public void verifyBengaliFirstArticleAds() {
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();       //It will click on First Article Of Bengali Home Page
		pages.desktopAdsValidation.verifyAds();         //It will verify advertisements is displayed
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Bengali photo section Page 
	 */
	@Test
	public void verifyBengaliPhotoSectionPageAds() {
		pages.desktopBengaliLandingPage.clickOnPhotoSection();        //It will click on photo section Of Bengali Home Page
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();// Click on First Article of photo gallery consumption Page.
		pages.desktopAdsValidation.verifyAds();        //It will verify advertisements is displayed
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Bengali first Live blog article Page 
	 */
	@Test
	public void verifyBengaliFirstLiveBlogArticleAds() {
		pages.desktopBengaliLandingPage.clickOnLiveBlogArticleHomePage();       //It will click on First Live blog Article Of Bengali Home Page
		pages.desktopAdsValidation.verifyAds();         //It will verify advertisements is displayed
	}
}