package com.news18.mobilesanitybodyvalidation;

import java.io.IOException;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 *This class contains the verification of schema structure in Mobile mode of News18 page
 */

public class MobileHindiSchemaValidation extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiHomePage() throws IOException, InterruptedException {
		pages.structuredSchemaValidation.schemaValidation();
	}

	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 hindi Photogallery page
	 * Url- https://hindi.news18.com/photogallery
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileHindiSanityLandingPage.clickOnPhotoSection();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */

	@Test
	public void hindiArticlePage() throws IOException, InterruptedException {
		pages.mobileHindiSanityLandingPage.clickOnFirstArticleHindiHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}


	/**
	 * @author DanishR
	 * This method is used to validate liveblog present in the News18 hindi home page 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiLiveblogPage() throws IOException, InterruptedException {
		pages.mobileHindiSanityLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();
		pages.structuredSchemaValidation.schemaValidation();
	}
	
	
	/**
	 * @author DanishR
	 * This method is used to validate video present in the News18 Assam home page 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileHindiSanityLandingPage.clickOnVideosSection();
		pages.structuredSchemaValidation.schemaValidation();	
	}
}
