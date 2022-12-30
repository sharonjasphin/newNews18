package com.news18.imageValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Telugu page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AmpTeluguArticleImageDimension extends MobileCommonConfig {

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Telugu Language URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Telugu Photogallerypage by taking The Help Of Amp Validator
	 * Url-  https://telugu.news18.com/amp/photogallery
	 */
	@Test
	public void teluguPhotoGalleryPage() {
		pages.mobileTeluguLandingPage.clickOnPhotoSection();
		pages.mobileTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Telugu Homepage by taking The Help Of Amp Validator
	 * Url- https://telugu.news18.com/amp/
	 */
	@Test
	public void teluguhArticlePage() {
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Telugu home page by taking the help of Amp validator
	 * Url- https://telugu.news18.com/amp/
	 */
	@Test
	public void teluguLiveblogPage() {
		pages.mobileTeluguLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
