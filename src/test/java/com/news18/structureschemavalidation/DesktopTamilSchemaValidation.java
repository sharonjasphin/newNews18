package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopTamilSchemaValidation extends DesktopCommonConfig{
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for  Tamil Language URL which is fetching from Property File
	 * URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18  Tamil Homepage 
	 * Url- https://tamil.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void tamilArticlePage() throws IOException, InterruptedException {
		pages.desktopTamilLandingPage.clickOnFirstArticleHomePage();;
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Assam Photogallery page
	 * Url- https://tamil.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void tamilPhotoGalleryPage() throws IOException, InterruptedException {
		pages.desktopTamilLandingPage.clickOnPhotosSection();
		pages.desktopTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();		
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18  Tamil home page 
	 * Url- https://tamil.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void tamilLiveblogPage() throws IOException, InterruptedException {
		pages.desktopTamilLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void tamilfirstVideoArticle() throws IOException, InterruptedException {
		pages.desktopTamilLandingPage.clickOnVideoLnk();
		pages.desktopTamilVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}

}
