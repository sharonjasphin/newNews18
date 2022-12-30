package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopPunjabSchemaValidation extends DesktopCommonConfig{
	

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for punjab Language URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 punjab Homepage 
	 * Url- https://punjab.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void punjabiArticlePage() throws IOException, InterruptedException {
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 punjab Photogallery page
	 * Url- https://punjab.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void punjabiPhotoGalleryPage() throws IOException, InterruptedException {
		pages.desktopPunjabLandingPage.clickOnPhotosSection();
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();		
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 punjab home page 
	 * Url- https://punjab.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void punjabLiveblogPage() throws IOException, InterruptedException {
		pages.desktopPunjabLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void punjabFirstVideoArticle() throws IOException, InterruptedException {
		pages.desktopPunjabLandingPage.clickOnVideoLnk();
		pages.desktopPunjabVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}

}
