package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopMalayalamSchemaValidation extends DesktopCommonConfig{
	
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for malayalam Language URL which is fetching from Property File
	 * URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToMalayalamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 malayalam Homepage 
	 * Url- https://malayalam.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void malayalamArticlePage() throws IOException, InterruptedException {
		pages.desktopMalayalamLandingPage.clickOnFirstArticleHomePage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 malayalam Photogallery page
	 * Url- https://malayalam.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void malayalamPhotoGalleryPage() throws IOException, InterruptedException {
		pages.desktopMalayalamLandingPage.clickOnPhotosSection();
		pages.desktopMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();		
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 malayalam home page 
	 * Url- https://malayalam.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void malayalamLiveblogPage() throws IOException, InterruptedException {
		pages.desktopMalayalamLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void malayalamFirstVideoArticlePage() throws IOException, InterruptedException {
		pages.desktopMalayalamLandingPage.clickOnVideoLnk();
		pages.desktopMalayalamVideosPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}


}
