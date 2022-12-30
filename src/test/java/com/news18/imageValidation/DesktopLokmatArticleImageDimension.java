package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in lokmat page by Navigating 
 * to view page Source Code page
 */

public class DesktopLokmatArticleImageDimension extends DesktopCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for lokmat Language URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 lokmat Homepage 
	 * Url- https://lokmat.news18.com/
	 */
	@Test
	public void lokmatArticlePage() {
		pages.desktopLokmatLandingPage.clickOnFirstArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 lokmat Photogallery page
	 * Url- https://lokmat.news18.com/photogallery
	 */
	@Test
	public void lokmatPhotoGalleryPage() {
		pages.desktopLokmatLandingPage.clickOnPhotosSection();
		pages.desktopLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();		
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 lokmat home page 
	 * Url- https://lokmat.news18.com/
	 */
	@Test
	public void lokmatLiveblogPage() {
		pages.desktopLokmatLandingPage.clickOnLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();		
	}
}
