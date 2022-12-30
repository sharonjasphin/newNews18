package com.news18.imageValidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Assam page by Navigating 
 * to view page Source Code page
 */

public class MobileAssamArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Assam Language URL which is fetching from Property File
	 * URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 Assam Photogallery page
	 * Url- https://assam.news18.com/photogallery
	 */
	@Test
	public void assamPhotoGalleryPage() {
		pages.mobileAssamLandingPage.clickOnPhotoSection();
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 Assam Homepage 
	 * Url- https://assam.news18.com/
	 */
	@Test
	public void assamArticlePage() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();;
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Assam home page 
	 * Url- https://assam.news18.com/
	 */
	@Test
	public void assamLiveblogPage() {
		pages.mobileAssamLandingPage.clickOnLiveBlogArticleHomePage();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
