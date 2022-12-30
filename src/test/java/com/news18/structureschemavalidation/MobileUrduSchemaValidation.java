package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */

public class MobileUrduSchemaValidation extends MobileCommonConfig{
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
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 urdu Photogallery page
	 * Url- https://urdu.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduPhotoGalleryPage() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnPhotoSection();
		pages.mobileUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 urdu Homepage 
	 * Url- https://urdu.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduArticlePage() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnFirstArticleUrduHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 urdu home page 
	 * Url- https://urdu.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduLiveblogPage() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnLiveBlogArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 punjab home page 
	 * Url- https://punjab.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void urduFirstVideoArticle() throws IOException, InterruptedException {
		pages.urduMobileLandingPage.clickOnVideoSection();
		pages.mobileUrduVideoPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
