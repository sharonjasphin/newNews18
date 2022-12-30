package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in malayalam page by Navigating 
 * to view page Source Code page
 */
public class MobileMalayalamArticleImageDimension extends MobileCommonConfig{

	/**
	 * This method is used to navigate to News18 Home Page for malayalam Language URL which is fetching from Property File
	 * URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToMalayalamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
	}


	/**
	 * This method is used to validate First Article in News18 malayalam Photogallery page
	 * Url- https://malayalam.news18.com/photogallery
	 */
	@Test
	public void malayalamPhotoGalleryPage() {
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * This method is used to validate First Article in News18 malayalam Homepage 
	 * Url- https://malayalam.news18.com/
	 */
	@Test
	public void malayalamArticlePage() {
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();;
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * This method is used to validate liveblog present in the News18 malayalam home page 
	 * Url- https://malayalam.news18.com/
	 */
	@Test
	public void malayalamLiveblogPage() {
		pages.mobileMalayalamLandingPage.clickOnFirstLiveBlogArticleMalayalamHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
