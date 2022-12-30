package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verificaltion of schema structure in Desktop mode of News18 page
 */
public class DesktopAssamSchemaValidation extends DesktopCommonConfig{
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));

	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Assam Homepage 
	 * Url- https://bengali.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void assamHomePageArticle() throws IOException, InterruptedException {
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Assam Photogallery page
	 * Url- https://assam.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void assamPhotogalleryArticle() throws IOException, InterruptedException {
		pages.desktopAssamLandingPage.clickOnPhotosSection();
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 Assam home page 
	 * Url- https://bengali.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void assamLiveblogArticle() throws IOException, InterruptedException {
		pages.desktopAssamLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void assamFirstVideoArticle() throws IOException, InterruptedException {
		pages.desktopAssamLandingPage.clickOnVideoLnk();
		pages.desktopAssamVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();
	}

}
