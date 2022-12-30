package com.news18.structureschemavalidation;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the script for verification of schema structure of an article like Homepage article,
 *photogallery article,liveblog,videos
 */
public class AmpHindiSchemaValidation extends MobileCommonConfig {

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Hindi Language URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String currentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(currentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 Hindi  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnPhotoSection();
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 Hindi page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiArticlePage() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Liveblog in homepage AMP url on News18 Hindi page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiLiveblogPage() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Videos in homepage AMP url on News18 Hindi page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnVideosSection();
		pages.mobileHindiVideoSectionPage.clickOnFirstArticleVideoPage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}



