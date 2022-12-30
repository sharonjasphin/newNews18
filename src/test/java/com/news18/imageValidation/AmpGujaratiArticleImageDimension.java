package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Gujarati page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AmpGujaratiArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Gujarati Language URL which is fetching from Property File
	 * URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Gujarati Photogallerypage by taking The Help Of Amp Validator
	 * Url-  https://gujarati.news18.com/amp/photogallery
	 */
	@Test
	public void gujaratiPhotoGalleryPage() {
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Gujarati Homepage by taking The Help Of Amp Validator
	 * Url-  https://gujarati.news18.com/amp
	 */
	@Test
	public void gujaratiArticlePage() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Gujarati home page by taking the help of Amp validator
	 * Url-  https://gujarati.news18.com/amp
	 */
	@Test
	public void gujaratiLiveblogPage() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}
}
