package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Kannada Robot Text and max-image-preview:large text and getting from view page Source Code page
 * in Mobile Mode and Taking The Help Of Desktop Meta Tag Validation Page 
 *  
 */
public class MobileKannadaMetaTag extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Kannada Language URL which is fetching from Property File
	 * URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Kannada Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 *  page Source Code Page
	 */

	@Test
	public void verifyMetatagInHomeArticle() {
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();//Click on First Article Of kannada Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Kannada PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.mobileKannadaLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article Of photogallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 Kannada Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.mobileKannadaLandingPage.clickOnFirstLiveBlogArticleKannadaHomePage();//Click on First live blog Article Of home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}

}
