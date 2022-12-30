package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Bengali page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */

public class AmpBengaliArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Bengali Language URL which is fetching from Property File
	 * URL-https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Bengali Photogallerypage by taking The Help Of Amp Validator
	 * Url-  https://bengali.news18.com/amp/photogallery
	 */
	@Test
	public void bengaliPhotoGalleryPage() {
		pages.mobileBengaliLandingPage.clickOnPhotoSection();
		pages.mobileBengaliPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}	


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Bengali Homepage by taking The Help Of Amp Validator
	 * Url- https://bengali.news18.com/amp
	 */
	@Test
	public void bengaliArticlePage() {
		pages.mobileBengaliLandingPage.clickOnFirstArticleBengaliHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Bengali  Homepage by taking the help of Amp validator
	 * https://bengali.news18.com/amp
	 */
	@Test
	public void bengaliLiveblogPage() {
		pages.mobileBengaliLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
