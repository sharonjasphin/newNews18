package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Urdu page by Navigating 
 * to view page Source Code page
 */

public class DesktopUrduArticleImageDimension extends DesktopCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Urdu Language URL which is fetching from Property File
	 * URL-https://urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToUrduHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 urdu Homepage 
	 * Url- https://urdu.news18.com/
	 */
	@Test
	public void urduArticlePage() {
		pages.desktopUrduLandingPage.clickOnFirstArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 urdu Photogallery page
	 * Url- https://urdu.news18.com/photogallery
	 */
	@Test
	public void urduPhotoGalleryPage() {
		pages.desktopUrduLandingPage.clickOnPhotosSection();
		pages.desktopUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();		
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 urdu home page 
	 * Url- https://urdu.news18.com/
	 */
	@Test
	public void urduLiveblogPage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
