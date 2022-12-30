package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */

public class MobileAssamSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Assam Language URL which is fetching from Property File
	 * URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Assam Photogallery page
	 * Url- https://assam.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void assamPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileAssamLandingPage.clickOnPhotoSection();
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Assam Homepage 
	 * Url- https://assam.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void assamArticlePage() throws IOException, InterruptedException {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 Assam home page 
	 * Url- https://assam.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void assamLiveblogPage() throws IOException, InterruptedException {
		pages.mobileAssamLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void assamFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileAssamLandingPage.clickOnVideos();
		pages.mobileAssamVideosSectionPage.clickVideoSectionFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
