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
public class AmpBengaliSchemaValidation extends MobileCommonConfig{
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Bengali Language URL which is fetching from Property File
	 * URL-https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
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
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 Bengali  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnPhotoSection();
		pages.mobileBengaliPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}	


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 Bengali  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliArticlePage() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnFirstArticleBengaliHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Liveblog in homepage AMP url on News18 Bengali  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliLiveblogPage() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Videos in homepage AMP url on News18 Bengali  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnVideosSection();
		pages.mobileBengaliVideoSectionPage.clickOnFirstArticleVideosSectionPage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}
