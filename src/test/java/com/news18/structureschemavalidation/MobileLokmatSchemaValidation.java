package com.news18.structureschemavalidation;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verificaltion of schema structure in Mobile mode of News18 page
 */

public class MobileLokmatSchemaValidation extends MobileCommonConfig{
	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for lokmat Language URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 lokmat Photogallery page
	 * Url- https://lokmat.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void lokamtPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileLokmatLandingPage.clickOnPhotoSection();
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 lokmat Homepage 
	 * Url- https://lokmat.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void lokmatArticlePage() throws IOException, InterruptedException {
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 lokmat home page 
	 * Url- https://lokmat.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void lokmatLiveblogPage() throws IOException, InterruptedException {
		pages.mobileLokmatLandingPage.clickOnFirstLiveBlogArticleLokmatHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Assam home page 
	 * Url- https://assam.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test public void lokmatFirstVideoArticle() throws IOException,InterruptedException {
		pages.mobileLokmatLandingPage.clickOnVideoSection();
		pages.mobileLokmatVideoPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation(); 
	}
}
