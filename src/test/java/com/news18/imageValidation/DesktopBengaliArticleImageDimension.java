package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Benagli page by Navigating 
 * to view page Source Code page
 */

public class DesktopBengaliArticleImageDimension extends DesktopCommonConfig {

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Bengali Language URL which is fetching from Property File
	 * URL-https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 Bengali Homepage 
	 * Url- https://bengali.news18.com/
	 */
	@Test
	public void bengliArticlePage() {
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 Bengali Photogallery page
	 * Url- https://assam.news18.com/photogallery
	 */
	@Test
	public void bengaliPhotoGalleryPage() {
		pages.desktopBengaliLandingPage.clickOnPhotoSection();
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();	
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Bengali home page 
	 * Url- https://bengali.news18.com/
	 */
	@Test
	public void bengaliLiveblogPage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}

