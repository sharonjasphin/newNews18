package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in punjab page by Navigating 
 * to view page Source Code page
 */

public class DesktopPunjabiArticleImageDimension extends DesktopCommonConfig {

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for punjab Language URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 punjab Homepage 
	 * Url- https://punjab.news18.com/
	 */
	@Test
	public void punjabiArticlePage() {
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 punjab Photogallery page
	 * Url- https://punjab.news18.com/photogallery
	 */
	@Test
	public void punjabiPhotoGalleryPage() {
		pages.desktopPunjabLandingPage.clickOnPhotosSection();
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();		
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 punjab home page 
	 * Url- https://punjab.news18.com/
	 */
	@Test
	public void punjabLiveblogPage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
