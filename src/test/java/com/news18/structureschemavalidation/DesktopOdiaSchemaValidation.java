package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopOdiaSchemaValidation extends DesktopCommonConfig{
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for odia Language URL which is fetching from Property File
	 * URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 odia Homepage 
	 * Url- https://odia.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void odiaArticlePage() throws IOException, InterruptedException {
		pages.desktopOdiaLandingPage.clickOnFirstArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 odia Photogallery page
	 * Url- https://odia.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void odiaPhotoGalleryPage() throws IOException, InterruptedException {
		pages.desktopOdiaLandingPage.clickOnPhotosSection();
		pages.desktopOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();		
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 odia home page 
	 * Url- https://odia.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void odiaLiveblogPage() throws IOException, InterruptedException {
		pages.desktopOdiaLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void odiaFirstVideoArticlePage() throws IOException, InterruptedException {
		pages.desktopOdiaLandingPage.clickOnVideoLnk();
		pages.desktopOdiaVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();
	}


}
