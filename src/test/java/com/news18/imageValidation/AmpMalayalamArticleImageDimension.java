package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Malayalam page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AmpMalayalamArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for malayalam Language URL which is fetching from Property File
	 * URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToMalayalamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 malayalam Photogallerypage by taking The Help Of Amp Validator
	 * Url- https://malayalam.news18.com/amp/photogallery
	 */
	@Test
	public void malayalamPhotoGalleryPage() {
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 malayalam Homepage by taking The Help Of Amp Validator
	 * Url- https://malayalam.news18.com/amp
	 */
	@Test
	public void malayalamArticlePage() {
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Malayalam home page by taking the help of Amp validator
	 * Url- https://malayalam.news18.com/amp
	 */
	@Test
	public void malayalamLiveblogPage() {
		pages.mobileMalayalamLandingPage.clickOnFirstLiveBlogArticleMalayalamHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
