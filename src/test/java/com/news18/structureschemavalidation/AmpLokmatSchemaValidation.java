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
public class AmpLokmatSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Lokmat Language URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
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
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 Lokmat page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void lokamtPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileLokmatLandingPage.clickOnPhotoSection();
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 Lokmat page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void lokmatArticlePage() throws IOException, InterruptedException {
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Liveblog in homepage AMP url on News18 Lokmat page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void lokmatLiveblogPage() throws IOException, InterruptedException {
		pages.mobileLokmatLandingPage.clickOnFirstLiveBlogArticleLokmatHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Lokmat home page by taking the help of Amp validator
	 * Url- https://kannada.news18.com/amp/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void lokmatFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileLokmatLandingPage.clickOnVideoSection();
		pages.mobileLokmatVideoPage.clickOnFirstArticleVideoPage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}
