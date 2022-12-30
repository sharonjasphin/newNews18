package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */
public class MobileOdiaSchemaValidation extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for odia Language URL which is fetching from Property File
	 * URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 odia Photogallery page
	 * Url- https://odia.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void odiaPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileOdiaLandingPage.clickOnPhotosSection();
		pages.mobileOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 odia Homepage 
	 * Url- https://odia.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void odiaArticlePage() throws IOException, InterruptedException {
		pages.mobileOdiaLandingPage.clickOnFirstArticleOdiaHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate liveblog present in the News18 odia home page 
	 * Url- https://odia.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void odiaLiveblogPage() throws IOException, InterruptedException {
		pages.mobileOdiaLandingPage.clickOnFirstLiveBlogArticleOdiaHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author DanishR
	 * This method is used to validate video present in the News18 Assam home page 
	 * Url- https://assam.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void odiaFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileOdiaLandingPage.clickOnVideoSection();
		pages.mobileOdiaVideoSectionPage.clickOnVideoSectionFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
