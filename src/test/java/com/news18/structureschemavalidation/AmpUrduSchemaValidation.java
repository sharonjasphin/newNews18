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
public class AmpUrduSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Urdu Language URL which is fetching from Property File
	 * URL-https://urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToUrduHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
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
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 Assam  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduPhotoGalleryPage() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnPhotoSection();
		pages.mobileUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 Assam  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduArticlePage() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnFirstArticleUrduHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 Urdu home page by taking the help of Amp validator
	 * Url- https://urdu.news18.com/amp/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduLiveblogPage() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Urdu home page by taking the help of Amp validator
	 * Url- https://urdu.news18.com/amp/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduFirstVideoArticle() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnVideoSection();
		pages.mobileUrduVideoPage.clickOnFirstArticleVideoPage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}
