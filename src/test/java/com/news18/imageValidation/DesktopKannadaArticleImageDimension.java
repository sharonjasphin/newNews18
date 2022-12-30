package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in kannada page by Navigating 
 * to view page Source Code page
 */

public class DesktopKannadaArticleImageDimension extends DesktopCommonConfig {

	/**@author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for kannada Language URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 kannada Homepage 
	 * Url- https://kannada.news18.com/
	 */
	@Test
	public void kannadaArticlePage() {
		pages.desktopKannadaLandingPage.clickOnFirstArticleHomePage();;
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 kannada Photogallery page
	 * Url- https://kannada.news18.com/photogallery
	 */
	@Test
	public void kannadaPhotoGalleryPage() {
		pages.desktopKannadaLandingPage.clickOnPhotosSection();
		pages.desktopKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();	
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 kannada home page 
	 * Url- https://kannada.news18.com/
	 */
	@Test
	public void kannadaLiveblogPage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}