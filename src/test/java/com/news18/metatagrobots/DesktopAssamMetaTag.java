package com.news18.metatagrobots;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.commonpages.MetaTagValidation;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.FileUtility;
import com.news18.init.InitializePages;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 * This Test Class contains scripts for Verification of Assam Robot Text and max-image-preview:large text and getting from view page Source Code page
 * in Desktop Mode and Taking The Help Of Desktop Meta Tag Validation Page 
 *  
 */
public class DesktopAssamMetaTag extends DesktopCommonConfig{

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Assam Language URL which is fetching from Property File
	 * Url- https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 *  page Source Code Page
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();//Click on First Article Of Assam Home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam Photo Gallery Consumption Page and 
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 *
	 */
	@Test
	public void verifyMetatagInPhotoGalleryArticle() {
		pages.desktopAssamLandingPage.clickOnPhotosSection();//Click on photo section link present on line one of home page
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photogallery consumption Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}	

	
	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Live Blog Article of News18 Assam Home Page and
	 * Validate The Robots text and max-image-preview:large text getting from the view
	 * page Source Code Page
	 */
	@Test
	public void verifyMetatagInLiveBlogArticle() {
		pages.desktopAssamLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article Of home Page
		pages.desktopMetaTagValidation.verifyMetaTag();//Verify Robots text and max-image-preview:large text is present or not 
	}
}



