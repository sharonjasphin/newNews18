package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of English Robot Text and max-image-preview:large text and getting from view page Source Code page
 * in Mobile Mode and Taking The Help Of Desktop Meta Tag Validation Page 
 *  
 */
public class MobileEnglishMetaTag extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for English Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 English Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 *  page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();//Click on First Article of English Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 English PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.mobileLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//It will navigate to new photo gallery first article
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 English Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}

}
