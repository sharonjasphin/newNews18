package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */
public class MobileBengaliSchemaValidation extends MobileCommonConfig{
	
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
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Bengali Photogallery page
	 * Url- https://assam.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnPhotoSection();
		pages.mobileBengaliPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Bengali Homepage 
	 * Url- https://bengali.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliArticlePage() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnFirstArticleBengaliHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 Bengali home page 
	 * Url- https://bengali.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliLiveblogPage() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnLiveBlogArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Assam home page 
	 * Url- https://assam.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengaliFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileBengaliLandingPage.clickOnVideosSection();
		pages.mobileBengaliVideoSectionPage.clickOnFirstArticleVideosSectionPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}

