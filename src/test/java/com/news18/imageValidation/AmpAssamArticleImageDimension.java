package com.news18.imageValidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 * This Test Class contains scripts for Verification of width and height of an article image present in Assam page by Navigating and getting Amp Url
 * from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */

public class AmpAssamArticleImageDimension extends MobileCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Assam Language URL which is fetching from Property File
	 * URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
	}
	
	
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Assam Photogallery page by taking The Help Of Amp Validator
	 * Url- https://assam.news18.com/amp/photogallery
	 */
	@Test
	public void assamPhotoGalleryPage() {
		pages.mobileAssamLandingPage.clickOnPhotoSection();
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate First Article AMP url on News18 Assam Homepage by taking The Help Of Amp Validator
	 * Url- https://assam.news18.com/amp
	 */
	@Test
	public void assamArticlePage() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate liveblog present in the News18 Assam home page by taking the help of Amp validator
	 * Url- https://assam.news18.com/amp
	 */
	@Test
	public void assamLiveblogPage() {
		pages.mobileAssamLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.imageValidationPage.verifyImageDimension();	
	}
}
