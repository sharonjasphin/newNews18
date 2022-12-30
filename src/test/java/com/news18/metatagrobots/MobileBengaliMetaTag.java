package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Bengali Robot Text and max-image-preview:large text and getting from view page Source Code page
 * in Mobile Mode and Taking The Help Of Desktop Meta Tag Validation Page 
 *  
 */
public class MobileBengaliMetaTag extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Bengali Language URL which is fetching from Property File
	 *  URL- https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Bengali Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.mobileBengaliLandingPage.clickOnFirstArticleBengaliHomePage();// Click on First Article of Home Page.
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Bengali PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.mobileBengaliLandingPage.clickOnPhotoSection();//Click on photo section link of Home Page.
		pages.mobileBengaliPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//click on First Article of photogallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	


}
