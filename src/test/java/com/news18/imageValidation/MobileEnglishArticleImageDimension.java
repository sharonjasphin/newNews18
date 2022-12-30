package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in English page by Navigating 
 * to view page Source Code page
 */

public class MobileEnglishArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Engalish Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 english Photogallery page
	 * Url- https://english.news18.com/photogallery
	 */
	@Test
	public void englishPhotoGalleryPage() {
		pages.mobileLandingPage.clickOnPhotoSection();
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 English Homepage 
	 * Url- https://english.news18.com/
	 */
	@Test
	public void englishhArticlePage() {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 english home page 
	 * Url- https://english.news18.com/
	 */
	@Test
	public void englishLiveblogPage() {
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();
	}
}

