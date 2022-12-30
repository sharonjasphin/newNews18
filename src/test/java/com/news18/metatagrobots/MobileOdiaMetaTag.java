package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Odia Robot Text and max-image-preview:large text and getting from view page Source Code page
 * in Mobile Mode and Taking The Help Of Desktop Meta Tag Validation Page 
 *  
 */
public class MobileOdiaMetaTag extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Odia Language URL which is fetching from Property File
	 * URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Odia Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 *  page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.mobileOdiaLandingPage.clickOnFirstArticleOdiaHomePage();//Click on First Article Of odia Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Odia PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.mobileOdiaLandingPage.clickOnPhotosSection();//Click on photo section link present on line one of home page
		pages.mobileOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article Of photogallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	
}
