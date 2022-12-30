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

public class DesktopLokmatMetaTag extends DesktopCommonConfig{


	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Lokmat Language URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Lokmat Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 * 
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.desktopLokmatLandingPage.clickOnFirstArticleHomePage();//Click on First Article Of lokmat Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Lokmat PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.desktopLokmatLandingPage.clickOnPhotosSection();//Click on photo section link present on header part of home page
		pages.desktopLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();// click on First Article Of photgallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 Lokmat Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.desktopLokmatLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article Of Lokmat Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}


}




