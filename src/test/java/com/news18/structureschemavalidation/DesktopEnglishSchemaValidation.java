package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopEnglishSchemaValidation extends DesktopCommonConfig{
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 English Homepage 
	 * Url- https://english.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishArticlePage() throws IOException, InterruptedException {
		pages.desktopLandingPage. clickOnFirstArticleHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 english Photogallery page
	 * Url- https://english.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishPhotoGalleryPage() throws IOException, InterruptedException {
		pages.desktopLandingPage.clickOnPhotosSection();
		pages.desktopphotoGalleryConsumptionPage.clickOnFirstArt();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 english home page 
	 * Url- https://english.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishLiveblogPage() throws IOException, InterruptedException {
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
	public void englishfirstVideoArticle() throws IOException, InterruptedException {
		pages.desktopLandingPage.navigateToFirstVideosArticle();
		pages.structuredSchemaValidation.schemaValidation();

	}
}
