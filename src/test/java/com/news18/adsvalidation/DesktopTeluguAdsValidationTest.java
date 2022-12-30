package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for Telugu News18 desktop page
 * 
 */
public class DesktopTeluguAdsValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Telugu Home page URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Telugu Home Page 
	 */
	@Test
	public void verifyTeluguHomePageAds() {
		pages.desktopAdsValidation.verifyAds();        //It will verify advertisements is displayed 
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Telugu photo section Page 
	 */
	@Test
	public void verifyTeluguPhotoSectionPageAds() {
		pages.desktopTeluguLandingPage.clickOnPhotosSection();       //It will click on photo section Of Telugu Home Page
		pages.desktopTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Telugu first article Page 
	 */
	@Test
	public void verifyTeluguFirstArticleAds() {
		pages.desktopTeluguLandingPage.clickOnFirstArticleHomePage();       //It will click on First Article Of Telugu Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

	
	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Telugu first Live Blog article Page 
	 */
	@Test
	public void verifyTeluguFirstLiveBlogArticleAds() {
		pages.desktopTeluguLandingPage.clickOnLiveBlogArticleHomePage();       //It will click on First Live blog Article Of Telugu Home Page
		pages.desktopAdsValidation.verifyAds();       //It will verify advertisements is displayed 
	}

}
