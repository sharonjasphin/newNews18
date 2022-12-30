package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopKannadaSchemaValidation extends DesktopCommonConfig{
	/**@author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for kannada Language URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
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
		pages.desktopKannadaLandingPage.clickOnFirstArticleHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
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
		pages.desktopKannadaLandingPage.clickOnPhotosSection();
		pages.desktopKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
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
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Assam home page 
	 * Url- https://bengali.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void kannadaFirstVideoArticlePage() throws IOException, InterruptedException {
		pages.desktopKannadaLandingPage.clickOnVideoLnk();
		pages.desktopKannadaVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();
	}


}
