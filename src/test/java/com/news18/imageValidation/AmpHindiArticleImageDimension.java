package com.news18.imageValidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Hindi page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */

public class AmpHindiArticleImageDimension extends MobileCommonConfig {

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Hindi Language URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Hindi Photogallerypage by taking The Help Of Amp Validator
	 * Url-  https://hindi.news18.com/amp/photogallery
	 */
	@Test
	public void hindiPhotoGalleryPage() {
		pages.mobileHindiLandingPage.clickOnPhotoSection();
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Hindi Homepage by taking The Help Of Amp Validator
	 * Url- https://hindi.news18.com/amp/
	 */
	@Test
	public void hindiArticlePage() {
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Hindi home page by taking the help of Amp validator
	 * Url- https://hindi.news18.com/amp/
	 */
	@Test
	public void hindiLiveblogPage() {
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}
}



