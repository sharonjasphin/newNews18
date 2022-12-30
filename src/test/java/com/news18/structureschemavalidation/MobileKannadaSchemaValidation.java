package com.news18.structureschemavalidation;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */

public class MobileKannadaSchemaValidation extends MobileCommonConfig{
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for kannada Language URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 kannada Photogallery page
	 * Url- https://kannada.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void kannadaPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnPhotoSection();
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 kannada Homepage 
	 * Url- https://kannada.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void kannadaArticlePage() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 kannada home page 
	 * Url- https://kannada.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void kannadaLiveblogPage() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnFirstLiveBlogArticleKannadaHomePage();
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
	public void kannadaFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileKannadaLandingPage.clickOnVideoSection();
		pages.mobileKannadaVideoPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
