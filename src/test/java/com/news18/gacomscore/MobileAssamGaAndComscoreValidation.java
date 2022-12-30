package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 *  This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Assam
 */
public class MobileAssamGaAndComscoreValidation extends MobileCommonConfig{
	
	/**
	 * @author Abhishek Raj
	 * This method is used for navigate to Assam Home page URL which is fetching from Property File
	 * URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate GA on News18 Assam Home Page
	 */
	@Test
	public void verifyAssamHomePageGA() {
		pages.gaComscoreValidation.verifyGA();	//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam Home Page and validate GA 
	 */
	@Test
	public void verifyAssamFirstArticleGA() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();	//It will click on First Article Of Assam Home Page
		pages.gaComscoreValidation.verifyGA();	//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click First Article of News18 Assam PhotoGallery Consumption Page and validate GA 
	 */
	@Test
	public void  verifyAssamPhotoSectionPageGA(){
		pages.mobileAssamLandingPage.clickOnPhotoSection();		//It will click on photo section Of Assam Home Page
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.gaComscoreValidation.verifyGA();		//It will verify GA is present with 200 status code
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA on first article of News18 Assam Section Page 
	 */
	@Test
	public void verifyAssamLineOneSectionGA() {
		pages.mobileAssamLandingPage.clickOnLineOneSection();	 //It will click on photo section Of Assam Home Page
		pages.mobileAssamSectionPage.clickSectionFirstArticle();
		pages.gaComscoreValidation.verifyGA(); 		//It will verify GA is present with 200 status code
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Assam Homepage and validate GA  
	 */
	@Test
	public void  verifyAssamFirstLiveBLogArticleGA(){
		pages.mobileAssamLandingPage.clickOnLiveBlogArticleHomePage(); 	//It will click on photo section Of Assam Home Page
		pages.gaComscoreValidation.verifyGA(); 	//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Assam Language and validate GA
	 */
	@Test
	public void verifyAssamCricketNextArticleGA() {
		pages.mobileAssamLandingPage.clickOnSports(); 
		pages.mobileAssamCricketNextPage.clickCricketNextFirstArticle();	//It will click on photo section Of Assam Home Page
		pages.gaComscoreValidation.verifyGA();		//It will verify GA is present with 200 status code
	}
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Assam Videos Page and validate GA 
	 */
	@Test
	public void verifyAssamVideoFirstArticleGA() {
		pages.mobileAssamLandingPage.clickOnVideos();
		pages.mobileAssamVideosSectionPage.clickVideoSectionFirstArticle();		//It will click on photo section Of Assam Home Page
		pages.gaComscoreValidation.verifyGA();		//It will verify GA is present with 200 status code
	}
	
	
	//  -----------------------------Comscore Validation -------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 *This method is used to validate Comscore on News18 Assam Home Page
	 */
	@Test
	public void verifyAssamHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam Home Page and validate Comscore
	 */
	@Test
	public void verifyAssamFirstArticleComscore() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();	//It will click on First Article Of Assam Home Page
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code 
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click First Article of News18 Assam PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void  verifyAssamPhotoSectionPageComscore(){
		pages.mobileAssamLandingPage.clickOnPhotoSection();		//It will click on photo section Of Assam Home Page
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on first article of News18 Assam Section Page 
	 */
	@Test
	public void verifyAssamLineOneSectionComscore() {
		pages.mobileAssamLandingPage.clickOnLineOneSection();	//It will click on photo section Of Assam Home Page
		pages.mobileAssamSectionPage.clickSectionFirstArticle();
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Assam Homepage and validate Comscore 
	 */
	@Test
	public void  verifyAssamFirstLiveBLogArticleComscore(){
		pages.mobileAssamLandingPage.clickOnLiveBlogArticleHomePage(); 	//It will click on photo section Of Assam Home Page
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Assam Language and validate Comscore
	 */
	@Test
	public void verifyAssamCricketNextArticleComscore() {
		pages.mobileAssamLandingPage.clickOnSports(); 
		pages.mobileAssamCricketNextPage.clickCricketNextFirstArticle();	//It will click on photo section Of Assam Home Page
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code
	}
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Assam Videos Page and validate Comscore
	 */
	@Test
	public void verifyAssamVideoFirstArticleComscore() {
		pages.mobileAssamLandingPage.clickOnVideos();
		pages.mobileAssamVideosSectionPage.clickVideoSectionFirstArticle();		//It will click on photo section Of Assam Home Page
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code 
	}
}
