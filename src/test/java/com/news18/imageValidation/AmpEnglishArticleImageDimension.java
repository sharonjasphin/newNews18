package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in English page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AmpEnglishArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for English Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 English Photogallerypage by taking The Help Of Amp Validator
	 * Url-  https://english.news18.com/amp/photogallery
	 */
	@Test
	public void englishPhotoGalleryPage() {
		pages.mobileLandingPage.clickOnPhotoSection();
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 English Homepage by taking The Help Of Amp Validator
	 * Url-  https://english.news18.com/amp
	 */
	@Test
	public void englishhArticlePage() {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 English home page by taking the help of Amp validator
	 * Url-  https://english.news18.com/amp
	 */
	@Test
	public void englishLiveblogPage() {
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}
}

