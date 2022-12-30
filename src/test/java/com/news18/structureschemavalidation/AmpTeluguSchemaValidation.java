package com.news18.structureschemavalidation;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the script for verification of schema structure of an article like Homepage article,
 *photogallery article,liveblog,videos
 */
public class AmpTeluguSchemaValidation extends MobileCommonConfig {

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Telugu Language URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}
	
	
	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String currentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(currentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 Talugu  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnPhotoSection();
		pages.mobileTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 Telugu  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguhArticlePage() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate liveblog present in the News18 Telugu home page by taking the help of Amp validator
	 * Url- https://telugu.news18.com/amp/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguLiveblogPage() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate video present in the News18 Telugu home page by taking the help of Amp validator
	 * Url- https://telugu.news18.com/amp/
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void teluguFirstVideoArticle() throws IOException, InterruptedException {
		pages.mobileTeluguLandingPage.clickOnVideosSection();
		pages.mobileTeluguVideoSectionPage.clickvideoArticleLnk();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();	
	}
}
