package com.news18.structureschemavalidation;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */

public class MobileGujaratiSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Assam Language URL which is fetching from Property File
	 * URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 gujarati Photogallery page
	 * Url- https://gujarati.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 gujarati Homepage 
	 * Url- https://gujarati.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiArticlePage() throws IOException, InterruptedException {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 gujarati home page 
	 * Url- https://gujarati.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiLiveblogPage() throws IOException, InterruptedException {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();
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
	public void gujaratiFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileGujaratiLandingPage.clickOnVideoSection();
		pages.mobileGujaratiVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
