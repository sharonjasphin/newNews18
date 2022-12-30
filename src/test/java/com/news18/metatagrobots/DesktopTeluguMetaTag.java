package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.Logs;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Robot Text and max-image-preview:large text are getting from view page Source Code page
 *  in Desktop Mode and Validate with The Help Of Desktop Meta Tag Validation Page 
 *  
 */
public class DesktopTeluguMetaTag extends DesktopCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Telugu Language URL which is fetching from Property File
	 * URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Telugu Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.desktopTeluguLandingPage.clickOnFirstArticleHomePage();//Click on First Article Of telugu Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Telugu PhotoGallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.desktopTeluguLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 Telugu Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.desktopTeluguLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 

	}

}
