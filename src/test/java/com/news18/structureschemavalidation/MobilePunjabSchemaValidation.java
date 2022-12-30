package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */
public class MobilePunjabSchemaValidation extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for punjab Language URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 punjab Photogallery page
	 * Url- https://punjab.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void punjabPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobilePunjabLandingPage.clickOnPhotoSection();
		pages.mobilePunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 punjab Homepage 
	 * Url- https://punjab.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void punjabArticlePage() throws IOException, InterruptedException {
		pages.mobilePunjabLandingPage.clickOnFirstArticlePunjabHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate liveblog present in the News18 punjab home page 
	 * Url- https://punjab.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void punjabLiveblogPage() throws IOException, InterruptedException {
		pages.mobilePunjabLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author DanishR
	 * This method is used to validate video present in the News18 punjab home page 
	 * Url- https://punjab.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void punjabFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobilePunjabLandingPage.clickOnVideoSection();
		pages.mobilePunjabVideoSectionPage.clickVideoSectionFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
