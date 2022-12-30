package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Punjab page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */

public class AmpPunjabArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Punjab Language URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Punjab Photogallerypage by taking The Help Of Amp Validator
	 * Url- https://punjab.news18.com/amp/photogallery
	 */
	@Test
	public void punjabPhotoGalleryPage() {
		pages.mobilePunjabLandingPage.clickOnPhotoSection();
		pages.mobilePunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Punjab Homepage by taking The Help Of Amp Validator
	 * Url- https://punjab.news18.com/amp
	 */
	@Test
	public void punjabArticlePage() {
		pages.mobilePunjabLandingPage.clickOnFirstArticlePunjabHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Punjab home page by taking the help of Amp validator
	 * Url- https://punjab.news18.com/amp
	 */
	@Test
	public void punjabLiveblogPage() {
		pages.mobilePunjabLandingPage.clickOnFirstLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
