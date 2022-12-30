package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Telugu page by Navigating 
 * to view page Source Code page
 */

public class MobileTeluguArticleImageDimension extends MobileCommonConfig {

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Telugu Language URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */

//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 Telugu Photogallery page
	 * Url- https://telugu.news18.com/amp/photogallery
	 */
	@Test
	public void teluguPhotoGalleryPage() {
		pages.mobileTeluguLandingPage.clickOnPhotoSection();
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 Telugu Homepage 
	 * Url- https://telugu.news18.com/
	 */
	@Test
	public void teluguhArticlePage() {
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 telugu home page 
	 * Url- https://telugu.news18.com/
	 */
	@Test
	public void teluguLiveblogPage() {
		pages.mobileTeluguLandingPage.clickOnLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
