package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Robot Text and max-image-preview:large text are getting from view page Source Code page
 *  in Desktop Mode and Validate with The Help Of Desktop Meta Tag Validation Page 
 *  
 */

public class DesktopHindiMetaTag extends DesktopCommonConfig{


	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Hindi Language URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Hindi Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();//Click on First Article of Hindi Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Hindi Photo Gallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.desktopHindiLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();//click on First Article Of photoArticle  Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}	


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 Hindi Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}
}
