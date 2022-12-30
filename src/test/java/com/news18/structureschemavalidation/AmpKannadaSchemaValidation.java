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
public class AmpKannadaSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Kannada Language URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
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
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 Kannada  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void kannadaPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnPhotoSection();
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 Kannada page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void kannadahArticlePage() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Liveblog in homepage AMP url on News18 Kannada page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void assamLiveblogPage() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnFirstLiveBlogArticleKannadaHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Kannada home page by taking the help of Amp validator
	 * Url- https://kannada.news18.com/amp/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void kannadaFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnVideoSection();
		pages.mobileKannadaVideoPage.clickOnFirstArticleVideoPage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}

