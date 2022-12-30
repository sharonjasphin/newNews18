package com.news18.structureschemavalidation;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */

public class MobileEnglishSchemaValidation extends MobileCommonConfig{
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Engalish Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
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
		pages.mobileLandingPage.clickOnPhotoSection();
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 English Homepage 
	 * Url- https://english.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishhArticlePage() throws IOException, InterruptedException {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();
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
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();
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
	public void englishVideoPage() throws IOException, InterruptedException {
		pages.mobileLandingPage.clickOnVideoSection();
		pages.mobileVideosArticlePage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();
		
	}

}
