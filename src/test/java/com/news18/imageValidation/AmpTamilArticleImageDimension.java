package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Tamil page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AmpTamilArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Tamil Language URL which is fetching from Property File
	 * URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Tamil Photogallerypage by taking The Help Of Amp Validator
	 * Url- https://tamil.news18.com/amp/photogallery
	 */
	@Test
	public void tamilPhotoGalleryPage() {
		pages.mobileTamilLandingPage.clickOnPhotoSection();
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Tamil Homepage by taking The Help Of Amp Validator
	 * Url- https://tamil.news18.com/amp/ 
	 */
	@Test
	public void tamilArticlePage() {
		pages.mobileTamilLandingPage.clickOnFirstArticleTamilHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Tamil home page by taking the help of Amp validator
	 * Url- https://tamil.news18.com/
	 */
	@Test
	public void tamilLiveblogPage() {
		pages.mobileTamilLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}


