package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Odia page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AmpOdiaArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Odia Language URL which is fetching from Property File
	 * URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Odia Photogallerypage by taking The Help Of Amp Validator
	 * Url- https://odia.news18.com/amp/photogallery
	 */
	@Test
	public void odiaPhotoGalleryPage() {
		pages.mobileOdiaLandingPage.clickOnPhotosSection();
		pages.mobileOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Odia Homepage by taking The Help Of Amp Validator
	 * Url- https://odia.news18.com/amp/
	 */
	@Test
	public void odiaArticlePage() {
		pages.mobileOdiaLandingPage.clickOnFirstArticleOdiaHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Odia home page by taking the help of Amp validator
	 * Url- https://odia.news18.com/amp/
	 */
	@Test
	public void odiaLiveblogPage() {
		pages.mobileOdiaLandingPage.clickOnFirstLiveBlogArticleOdiaHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
