package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */
public class MobileTamilSchemaValidation extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for  Tamil Language URL which is fetching from Property File
	 * URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 Assam Photogallery page
	 * Url- https://tamil.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void tamilPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileTamilLandingPage.clickOnPhotoSection();
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18  Tamil Homepage 
	 * Url- https://tamil.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void tamilArticlePage() throws IOException, InterruptedException {
		pages.mobileTamilLandingPage.clickOnFirstArticleTamilHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate liveblog present in the News18  Tamil home page 
	 * Url- https://tamil.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void tamilLiveblogPage() throws IOException, InterruptedException {
		pages.mobileTamilLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void tamilFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileTamilLandingPage.clickOnVideosSection();
		pages.mobileTamilVideoSectionPage.clickvideoArticleLnk();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
