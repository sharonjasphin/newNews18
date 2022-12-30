package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verificaltion of schema structure in Desktop mode of News18 page
 */
public class DesktopBengaliSchemaValidation extends DesktopCommonConfig{
	
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
	 * This method is used to validate First Article in News18 Bengali Homepage 
	 * Url- https://bengali.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void bengliArticlePage() throws IOException, InterruptedException {
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();
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
		pages.desktopBengaliLandingPage.clickOnPhotoSection();
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
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
	public void bengaliFirstVideoArticlePage() throws IOException, InterruptedException {
		pages.desktopBengaliLandingPage.navigateToVideosSection();
		pages.desktopBengaliVideosPage.clickOnFirstVideoArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}

}
