package com.news18.desktopsanitybodyvalidation;

import java.io.IOException;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
/**
 * @author DanishR
 *This class contains the verification of schema structure in Desktop mode of News18 page
 */
public class DesktopHindiSchemaValidation extends DesktopCommonConfig{


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
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://hindi.news18.com/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiArticlePage() throws IOException, InterruptedException {
		pages.desktopHindiSanityLandingPage.clickOnFirstArticleHomePage();
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
	public void hindiPhotogalleryPage() throws IOException, InterruptedException {
		pages.desktopHindiSanityLandingPage.clickOnPhotoSection();
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
		pages.desktopHindiSanityLandingPage.clickOnLiveBlogArticleHomePage(serverType);
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
	public void hindiFirstVideoArticlePage() throws IOException, InterruptedException {
		pages.desktopHindiSanityLandingPage.navigateToVideosSection();
		pages.structuredSchemaValidation.schemaValidation();
	}

}
