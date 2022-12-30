package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Kannada page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */


public class AmpKannadaArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Kannada Language URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Kannada Photogallerypage by taking The Help Of Amp Validator
	 * Url- https://kannada.news18.com/amp/photogallery
	 */
	@Test
	public void kannadaPhotoGalleryPage() {
		pages.mobileKannadaLandingPage.clickOnPhotoSection();
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Kannada Homepage by taking The Help Of Amp Validator
	 * Url- https://kannada.news18.com/amp/
	 */
	@Test
	public void kannadahArticlePage() {
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Kannada home page by taking the help of Amp validator
	 * Url- https://kannada.news18.com/amp/
	 */
	@Test
	public void assamLiveblogPage() {
		pages.mobileKannadaLandingPage.clickOnFirstLiveBlogArticleKannadaHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}

