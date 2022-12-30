package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Assam News18 desktop page
 *
 */
public class DesktopAssamAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Assam Home page URL which is fetching from Property File
	 * URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam Home Page 
	 */
	@Test
	public void verifyAssamHomePageAds() {
		pages.desktopAdsValidation.verifyAds(10000);        //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam photo section Page 
	 */
	@Test
	public void verifyAssamPhotoSectionPageAds() {
		pages.desktopAssamLandingPage.clickOnPhotosSection();       //It will click on photo section Of Assam Home Page
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds(10000);       //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam first article Page 
	 */
	@Test
	public void verifyAssamFirstArticleAds() {
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();      //It will click on First Article Of Assam Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Assam first Live Blog article Page 
	 */
	@Test
	public void verifyAssamFirstLiveBlogArticleAds() {
		pages.desktopAssamLandingPage.clickOnLiveBlogArticleHomePage();      //It will click on First Live blog Article Of Assam Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}
}