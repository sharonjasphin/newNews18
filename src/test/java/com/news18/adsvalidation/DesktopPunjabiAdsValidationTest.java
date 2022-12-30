package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Punjabi News18 desktop page
 * 
 */
public class DesktopPunjabiAdsValidationTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Punjabi Home page URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi Home Page 
	 */
	@Test
	public void verifyPunjabiHomePageAds() {
		pages.desktopAdsValidation.verifyAds(10000);     //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi photo section Page 
	 */
	@Test
	public void verifyPunjabiPhotoSectionPageAds() {
		pages.desktopPunjabLandingPage.clickOnPhotosSection();       //It will click on photo section Of Punjabi Home Page
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi first article Page 
	 */
	@Test
	public void verifyPunjabiFirstArticleAds() {
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();       //It will click on First Article Of Punjabi Home Page
		pages.desktopAdsValidation.verifyAds(15000);       //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Punjabi first Live Blog article Page 
	 */
	@Test
	public void verifyPunjabiFirstLiveBlogArticleAds() {
		pages.desktopPunjabLandingPage.clickOnLiveBlogArticleHomePage();     //It will click on First Live Blog Article Of Punjabi Home Page    
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

}
