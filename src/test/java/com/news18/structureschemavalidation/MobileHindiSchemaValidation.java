package com.news18.structureschemavalidation;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */

public class MobileHindiSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for hindi Language URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 hindi Photogallery page
	 * Url- https://hindi.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnPhotoSection();
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */

	@Test
	public void hindiArticlePage() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 hindi home page 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiLiveblogPage() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();
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
	public void hindiFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileHindiLandingPage.clickOnVideosSection();
		pages.mobileHindiVideoSectionPage.clickOnFirstArticleVideoPage();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
