package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Urdu page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */

public class AmpUrduArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Urdu Language URL which is fetching from Property File
	 * URL-https://urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToUrduHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Urdu Photogallerypage by taking The Help Of Amp Validator
	 * Url- https://urdu.news18.com/amp/photogallery
	 */
	@Test
	public void urduPhotoGalleryPage() {
		pages.urduMobileLandingPage.clickOnPhotoSection();
		pages.mobileUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Urdu Homepage by taking The Help Of Amp Validator
	 * Url- https://urdu.news18.com/amp/
	 */
	@Test
	public void urduArticlePage() {
		pages.urduMobileLandingPage.clickOnFirstArticleUrduHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Urdu home page by taking the help of Amp validator
	 * Url- https://urdu.news18.com/amp/
	 */
	@Test
	public void urduLiveblogPage() {
		pages.urduMobileLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
