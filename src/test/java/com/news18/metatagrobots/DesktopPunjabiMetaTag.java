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
public class DesktopPunjabiMetaTag extends DesktopCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Punjabi Language URL which is fetching from Property File
	 * URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateToPunjabHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Punjab Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();//Click on First Article Of punjab Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Punjab PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.desktopPunjabLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article Of photogallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 Punjab Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.desktopPunjabLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article Of home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}

}
