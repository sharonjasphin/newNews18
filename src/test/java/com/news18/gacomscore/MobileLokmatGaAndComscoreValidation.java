package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Lokmat
 */
public class MobileLokmatGaAndComscoreValidation extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to News18 Home Page for Lokmat Language URL which is fetching from Property File
	 *  URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on News18 Lokmat Home Page 
	 *
	 */
	@Test
	public void verifyLokmatHomePageGA() {
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Home Page 
	 *
	 */
	@Test
	public void verifyLokmatFirstArticleGA() {
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();   //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileLokmatLandingPage.clickOnSportsSection();   //click on sport link present in home page
		pages.mobileLokmatSportsPage.clickOnFirstArticleSportsPage();  //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleGA() {
		pages.mobileLokmatLandingPage.clickOnFirstSection();   //click on first section present in home page
		pages.mobileLokmatSectionPage.clickOnFirstArticleSectionPage();   //click on first section present in home page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileLokmatLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileLokmatLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileLokmatVideoPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Lokmat HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileLokmatLandingPage.clickOnFirstLiveBlogArticleLokmatHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Topic article of News18 Lokmat HomePage 
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.mobileLokmatLandingPage.clickOnFirstTopicLnkTrendingTopics();// Click on first article of trending topics link of Home Page.
		pages.gaComscoreValidation.verifyGA();//It will verify Comscore is present with 204 status code
	}


	//------------------------------- Comscore Validation -------------------------------------------//


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Lokmat Home Page 
	 *
	 */
	@Test
	public void verifyLokmatHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat Home Page 
	 *
	 */
	@Test
	public void verifyLokmatFirstArticleComscore() {
		pages.mobileLokmatLandingPage.clickOnFirstArticleLokmatHomePage();   //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileLokmatLandingPage.clickOnSportsSection();   //click on sport link present in home page
		pages.mobileLokmatSportsPage.clickOnFirstArticleSportsPage();  //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleComscore() {
		pages.mobileLokmatLandingPage.clickOnFirstSection();   //click on first section present in home page
		pages.mobileLokmatSectionPage.clickOnFirstArticleSectionPage();   //click on first section present in home page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileLokmatLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileLokmatLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileLokmatVideoPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Lokmat HomePage 
	 * 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileLokmatLandingPage.clickOnFirstLiveBlogArticleLokmatHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Topic article of News18 Lokmat HomePage 
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.mobileLokmatLandingPage.clickOnFirstTopicLnkTrendingTopics();// Click on first article of trending topics link of Home Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify GA is present with 200 status code
	}
	
	
}
