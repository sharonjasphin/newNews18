package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Kannada
 */
public class MobileKannadaGaAndComscoreValidation extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to News18 Home Page for Kannada Language URL which is fetching from Property File
	 *  URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on News18 Kannada Home Page 
	 */
	@Test
	public void verifyKannadaHomePageGA() {
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada Home Page 
	 *
	 */
	@Test
	public void verifyKannadaFirstArticleGA() {
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();  //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileKannadaLandingPage.clickOnSportsLnk();   //click on sport link present in home page
		pages.mobileKannadaSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleGA() {
		pages.mobileKannadaLandingPage.clickOnFirstSection();   //click on first section present in home page
		pages.mobileKannadaSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileKannadaLandingPage.clickOnPhotoSection();  //Click on photo section of Home Page.
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();  //Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileKannadaLandingPage.clickOnVideoSection();  //Click on video section of Home Page.
		pages.mobileKannadaVideoPage.clickOnFirstArticleVideoPage();  //Click on First Article of video Page.
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Kannada HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileKannadaLandingPage.clickOnFirstLiveBlogArticleKannadaHomePage();  //Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	//------------------------------- Comscore Validation ---------------------------------------//


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Kannada Home Page 
	 *
	 */
	@Test
	public void verifyKannadaHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada Home Page 
	 *
	 */
	@Test
	public void verifyKannadaFirstArticleComscore() {
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();  //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileKannadaLandingPage.clickOnSportsLnk();   //click on sport link present in home page
		pages.mobileKannadaSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleComscore() {
		pages.mobileKannadaLandingPage.clickOnFirstSection();   //click on first section present in home page
		pages.mobileKannadaSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileKannadaLandingPage.clickOnPhotoSection();  //Click on photo section of Home Page.
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();  //Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileKannadaLandingPage.clickOnVideoSection();  //Click on video section of Home Page.
		pages.mobileKannadaVideoPage.clickOnFirstArticleVideoPage();  //Click on First Article of video Page.
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Kannada HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileKannadaLandingPage.clickOnFirstLiveBlogArticleKannadaHomePage();  //Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}
}
