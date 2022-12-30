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
public class AmpMalayalamSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for malayalam Language URL which is fetching from Property File
	 * URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToMalayalamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
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
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 Malayalam page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void malayalamPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 Malayalam page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void malayalamArticlePage() throws IOException, InterruptedException {
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Liveblog in homepage AMP url on News18 Assam  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void malayalamLiveblogPage() throws IOException, InterruptedException {
		pages.mobileMalayalamLandingPage.clickOnFirstLiveBlogArticleMalayalamHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Malayalam home page by taking the help of Amp validator
	 * Url- https://malayalam.news18.com/amp
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void malayalamFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileMalayalamLandingPage.clickOnVideoSection();
		pages.mobileMalayalamVideosPage.clickOnFirstArticleVideoPage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}
