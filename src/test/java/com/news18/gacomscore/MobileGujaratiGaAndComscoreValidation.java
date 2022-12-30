package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Gujarati
 */
public class MobileGujaratiGaAndComscoreValidation extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to News18 Home Page for Gujarati Language URL which is fetching from Property File
	 *  URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiHomePageGA() {
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiFirstArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();  //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnSportsLnk();   //click on sport link present in home page
		pages.mobileGujaratiSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnFirstSection();    //click on first section present in home page
		pages.mobileGujaratiSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati videos section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileGujaratiVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Gujarati HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	// ----------------------------- Comscore ----------------------------------------//


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiFirstArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();  //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnSportsLnk();   //click on sport link present in home page
		pages.mobileGujaratiSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	//	/**
	//	 * @author AnupamGupta
	//	 * This method is used to validate Comscore on first article of News18 Gujarati Section Page 
	//	 *
	//	 */
	@Test
	public void verifySectionArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnFirstSection();    //click on first section present in home page
		pages.mobileGujaratiSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati videos section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileGujaratiVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Gujarati HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}
}
