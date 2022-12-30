package com.news18.imageValidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in hindi page by Navigating 
 * to view page Source Code page
 */

public class MobileHindiArticleImageDimension extends MobileCommonConfig {

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for hindi Language URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 hindi Photogallery page
	 * Url- https://hindi.news18.com/photogallery
	 */
	@Test
	public void hindiPhotoGalleryPage() {
		pages.mobileHindiLandingPage.clickOnPhotoSection();
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://hindi.news18.com/
	 */

	@Test
	public void hindiArticlePage() {
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 hindi home page 
	 * Url- https://hindi.news18.com/
	 */
	@Test
	public void hindiLiveblogPage() {
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();
		pages.imageValidationPage.verifyImageDimension();
	}
}



