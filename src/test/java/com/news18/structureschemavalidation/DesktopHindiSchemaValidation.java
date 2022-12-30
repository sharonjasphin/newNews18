package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopHindiSchemaValidation extends DesktopCommonConfig{

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
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiArticlePage() throws IOException, InterruptedException {
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();;
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Article in News18 hindi Photogallery page
	 * Url- https://hindi.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiPhotogalleryPage() throws IOException, InterruptedException {
		pages.desktopHindiLandingPage.clickOnPhotoSection();
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
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
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();
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
	public void hindiFirstVideoArticlePage() throws IOException, InterruptedException {
		pages.desktopHindiLandingPage.navigateToVideosSection();
		pages.desktopHindiVideosPage.clickOnFirstVideoArticle();
		pages.structuredSchemaValidation.schemaValidation();
	}

}
