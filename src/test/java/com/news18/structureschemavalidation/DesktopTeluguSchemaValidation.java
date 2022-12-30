package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopTeluguSchemaValidation extends DesktopCommonConfig{
	
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Telugu Language URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Telugu Homepage 
	 * Url- https://telugu.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguArticlePage() throws IOException, InterruptedException {
		pages.desktopTeluguLandingPage.clickOnFirstArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 Telugu Photogallery page
	 * Url- https://telugu.news18.com/amp/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguPhotoGalleryPage() throws IOException, InterruptedException {
		pages.desktopTeluguLandingPage.clickOnPhotosSection();;
		pages.desktopTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();			
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 telugu home page 
	 * Url- https://telugu.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguLiveblogPage() throws IOException, InterruptedException {
		pages.desktopTeluguLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void teluguFirstVideoArticlePage() throws IOException, InterruptedException {
		pages.desktopTeluguLandingPage.clickOnVideoLnk();
		pages.desktopTeluguVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();
	}
}
