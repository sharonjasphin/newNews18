package com.news18.structureschemavalidation;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Abhishek Raj
 *This class contains the script for verification of schema structure of an article like Homepage article,
 *photogallery article,liveblog,videos
 */
public class AmpEnglishSchemaValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for English Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		try {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
		catch (WebDriverException e) {

			e.printStackTrace();

			}
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
	 * This method is used to validate schema structure of First Article in photogallery AMP url in News18 English  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishPhotoGalleryPage() throws IOException, InterruptedException {
		pages.mobileLandingPage.clickOnPhotoSection();
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of First Article in homepage AMP url on News18 English page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishhArticlePage() throws IOException, InterruptedException {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Liveblog in homepage AMP url on News18 English  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishLiveblogPage() throws IOException, InterruptedException {
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
	}
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate schema structure of Videos in homepage AMP url on News18 English  page by taking The Help Of Amp Validator
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishVideoPage() throws IOException, InterruptedException {
		pages.mobileLandingPage.clickOnVideoSection();
		pages.mobileVideosArticlePage.clickOnFirstArticleVideoPage();
		changeToAmpURL();
		pages.structuredSchemaValidation.ampSchemaValidation();
		
	}
}

