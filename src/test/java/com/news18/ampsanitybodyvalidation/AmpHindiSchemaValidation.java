package com.news18.ampsanitybodyvalidation;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author DanishR
 *This class contains the script for verification of schema structure of an article like Homepage article,
 *photogallery article,liveblog,videos
 */
public class AmpHindiSchemaValidation extends MobileCommonConfig {


	/**
	 * @author DanishR
	 * This method is used to validate First Article in News18 hindi Homepage 
	 * Url- https://hindi.news18.com/amp
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiHomePage() throws IOException, InterruptedException {
		pages.structuredSchemaValidation.ampSchemaValidation();
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
		pages.ampHindiSanityLandingPage.clickOnPhotoSection();
		pages.structuredSchemaValidation.ampSchemaValidation();
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
		pages.ampHindiSanityLandingPage.clickOnFirstArticleHindiHomePage();
		pages.structuredSchemaValidation.ampSchemaValidation();
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
		pages.ampHindiSanityLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();
		pages.structuredSchemaValidation.ampSchemaValidation();
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
		pages.ampHindiSanityLandingPage.clickOnVideosSection();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}



