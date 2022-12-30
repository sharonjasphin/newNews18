package com.news18.desktopsanitybodyvalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author DanishR
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopGujaratiSchemaValidation extends DesktopCommonConfig{
	
	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://gujarati.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiHomePage() throws IOException, InterruptedException {
		pages.structuredSchemaValidation.schemaValidation();
	}
	
	
	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 gujarati Homepage 
	 * Url- https://gujarati.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiArticlePage() throws IOException, InterruptedException {
		pages.desktopGujaratiSanityLandingPage.clickOnFirstArticleHomePage(serverType);
		pages.structuredSchemaValidation.schemaValidation();
	}
	

	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 gujarati Photogallery page
	 * Url- https://gujarati.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiPhotoGalleryPage() throws IOException, InterruptedException {
		pages.desktopGujaratiSanityLandingPage.clickOnPhotoSection(serverType);
		pages.structuredSchemaValidation.schemaValidation();	
	}
	

	/**
	 * @author DanishR
	 * This method is used to validate liveblog present in the News18 gujarati home page 
	 * Url- https://gujarati.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiLiveblogPage() throws IOException, InterruptedException {
		pages.desktopGujaratiSanityLandingPage.clickOnLiveBlogArticleHomePage(serverType);
		pages.structuredSchemaValidation.schemaValidation();	
	}
	
	
	/**
	 * @author DanishR
	 * This method is used to validate video present in the News18 Assam home page 
	 * Url- https://bengali.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void gujaratiFirstArticleVideoArticle() throws IOException, InterruptedException {
		pages.desktopGujaratiSanityLandingPage.navigateToVideosSection(serverType);
		pages.structuredSchemaValidation.schemaValidation();	
	}

}
