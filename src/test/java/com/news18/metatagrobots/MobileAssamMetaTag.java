package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Assam Robot Text and max-image-preview:large text and getting from view page Source Code page
 * in Mobile Mode and Taking The Help Of Desktop Meta Tag Validation Page 
 *  
 */
public class MobileAssamMetaTag extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Assam Language URL which is fetching from Property File
	 *  Url- https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));//Click on First Article Of Assam Home Page
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 *  page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();//Click on First Article Of Assam Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.mobileAssamLandingPage.clickOnPhotoSection();//Click on photo section link present on line one of home page
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photogallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	


}
