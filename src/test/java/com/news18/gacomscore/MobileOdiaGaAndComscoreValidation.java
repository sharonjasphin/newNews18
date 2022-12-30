package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author AbhishekRaj
 *  This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Odia
 */
public class MobileOdiaGaAndComscoreValidation extends MobileCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for odia Language URL which is fetching from Property File
	 *  URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToodiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA on News18 Odia Home Page 
	 */
	@Test
	public void verifyOdiaHomePageGA() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Odia Home Page and validate GA 
	 */
	@Test
	public void verifyOdiaFirstArticleGA() {
		pages.mobileOdiaLandingPage.clickOnFirstArticleOdiaHomePage();//It will click on First Article Of odia Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code

	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Odia Language and validate GA 
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileOdiaLandingPage.clickOnSportsSection();
		pages.mobileOdiaCricketNextPage.clicksportsFirstArticle();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code

	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Odia Section Page and validate GA 
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.mobileOdiaLandingPage.clickOnSection();//click on Cinema link present on line one of home page
		pages.mobileOdiaSectionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click First Article of News18 Odia PhotoGallery Consumption Page and validate GA 
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileOdiaLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.mobileOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Odia Videos Page and validate GA   
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileOdiaLandingPage.clickOnVideoSection();//click on video section link present on line one of home page
		pages.mobileOdiaVideoSectionPage.clickOnVideoSectionFirstArticle();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Homepage and validate GA  
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileOdiaLandingPage.clickOnFirstLiveBlogArticleOdiaHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Cricket Next Page and validate GA   
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.mobileOdiaLandingPage.clickOnSportsSection();//click on sports section link present on line one of home page
		pages.desktopOdiaSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	// ------------------------------------- Comscore Validation ----------------------------------//


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Odia Home Page 
	 */
	@Test
	public void verifyOdiaHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Odia Home Page and validate Comscore 
	 */
	@Test
	public void verifyOdiaFirstArticleComscore() {
		pages.mobileOdiaLandingPage.clickOnFirstArticleOdiaHomePage();//It will click on First Article Of odia Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code

	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Odia Language and validate Comscore 
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileOdiaLandingPage.clickOnSportsSection();
		pages.mobileOdiaCricketNextPage.clicksportsFirstArticle();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code

	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Odia Section Page and validate Comscore 
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.mobileOdiaLandingPage.clickOnSection();//click on Cinema link present on line one of home page
		pages.mobileOdiaSectionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click First Article of News18 Odia PhotoGallery Consumption Page and validate Comscore 
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileOdiaLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.mobileOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Odia Videos Page and validate Comscore   
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileOdiaLandingPage.clickOnVideoSection();//click on video section link present on line one of home page
		pages.mobileOdiaVideoSectionPage.clickOnVideoSectionFirstArticle();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Homepage and validate Comscore  
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileOdiaLandingPage.clickOnFirstLiveBlogArticleOdiaHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Cricket Next Page and validate Comscore   
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.mobileOdiaLandingPage.clickOnSportsSection();//click on sports section link present on line one of home page
		pages.desktopOdiaSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}
}