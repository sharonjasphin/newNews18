package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Lokmat page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AmpLokmatArticleDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Lokmat Language URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Lokmat Photogallerypage by taking The Help Of Amp Validator
	 * Url- https://lokmat.news18.com/amp/photogallery
	 */
	@Test
	public void lokamtPhotoGalleryPage() {
		pages.mobileLokmatLandingPage.clickOnPhotoSection();
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Lokmat Homepage by taking The Help Of Amp Validator
	 * Url- https://lokmat.news18.com/amp/
	 */
	@Test
	public void lokmatArticlePage() {
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Lokmat home page by taking the help of Amp validator
	 * Url- https://lokmat.news18.com/amp/
	 */
	@Test
	public void lokmatLiveblogPage() {
		pages.mobileLokmatLandingPage.clickOnFirstLiveBlogArticleLokmatHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}
}
