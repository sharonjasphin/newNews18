package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Robot Text and max-image-preview:large text are getting from view page Source Code page
 *  in Desktop Mode and Validate with The Help Of Desktop Meta Tag Validation Page 
 *  
 */

public class DesktopGujaratiMetaTag extends DesktopCommonConfig {


	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Gujarati Language URL which is fetching from Property File
	 * URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Gujarati Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.desktopGujaratiLandingPage.clickOnFirstArticleHomePage();//Click on First Article of Home Page.
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Gujarati Photo Gallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.desktopGujaratiLandingPage.clickOnPhotosSection();//Click on photo section of Home Page.
		pages.desktopGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photogallery Consumption Page.
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 Gujarati Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.desktopGujaratiLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}
}
