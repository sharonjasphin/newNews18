package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Tamil page by Navigating 
 * to view page Source Code page
 */

public class DesktopTamilArticleImageDimension extends DesktopCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for  Tamil Language URL which is fetching from Property File
	 * URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18  Tamil Homepage 
	 * Url- https://tamil.news18.com/
	 */
	@Test
	public void tamilArticlePage() {
		pages.desktopTamilLandingPage.clickOnFirstArticleHomePage();;
		pages.imageValidationPage.verifyImageDimension();	
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 Assam Photogallery page
	 * Url- https://tamil.news18.com/photogallery
	 */
	@Test
	public void tamilPhotoGalleryPage() {
		pages.desktopTamilLandingPage.clickOnPhotosSection();
		pages.desktopTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();		
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18  Tamil home page 
	 * Url- https://tamil.news18.com/
	 */
	@Test
	public void tamilLivebolgPage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
