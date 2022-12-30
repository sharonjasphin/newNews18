package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in odia page by Navigating 
 * to view page Source Code page
 */

public class DesktopOdiaArticleImageDimension  extends DesktopCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for odia Language URL which is fetching from Property File
	 * URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 odia Homepage 
	 * Url- https://odia.news18.com/
	 */
	@Test
	public void odiaArticlePage() {
		pages.desktopOdiaLandingPage.clickOnFirstArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 odia Photogallery page
	 * Url- https://odia.news18.com/photogallery
	 */
	@Test
	public void odiaPhotoGalleryPage() {
		pages.desktopOdiaLandingPage.clickOnPhotosSection();
		pages.desktopOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();		
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 odia home page 
	 * Url- https://odia.news18.com/
	 */
	@Test
	public void odiaLiveblogPage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
