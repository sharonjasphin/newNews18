package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in gujarati page by Navigating 
 * to view page Source Code page
 */

public class MobileGujaratiArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Assam Language URL which is fetching from Property File
	 * URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 gujarati Photogallery page
	 * Url- https://gujarati.news18.com/photogallery
	 */
	@Test
	public void gujaratiPhotoGalleryPage() {
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 gujarati Homepage 
	 * Url- https://gujarati.news18.com/
	 */
	@Test
	public void gujaratiArticlePage() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();;
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 gujarati home page 
	 * Url- https://gujarati.news18.com/
	 */
	@Test
	public void gujaratiLiveblogPage() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();
		pages.imageValidationPage.verifyImageDimension();
	}
}
