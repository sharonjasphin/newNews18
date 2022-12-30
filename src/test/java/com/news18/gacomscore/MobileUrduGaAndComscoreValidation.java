package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Urdu
 */
public class MobileUrduGaAndComscoreValidation extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to News18 Home Page for Urdu Language URL which is fetching from Property File
	 *  URL-https:https://urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToUrduHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on News18 Urdu Home Page 
	 *
	 */
	@Test
	public void verifyUrduHomePageGA() {
		pages.gaComscoreValidation.verifyMobileGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Home Page 
	 *
	 */
	@Test
	public void verifyUrduFirstArticleGA() {
		pages.urduMobileLandingPage.clickOnFirstArticleUrduHomePage();   //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyMobileGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.urduMobileLandingPage.clickOnSportsSection();   //click on sport link present in home page
		pages.mobileUrduSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyMobileGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleGA() {
		pages.urduMobileLandingPage.clickOnNationsSection();   //click on Nation section present in home page
		pages.mobileUrduSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyMobileGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.urduMobileLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyMobileGA();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first article of News18 Urdu video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.urduMobileLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileUrduVideoPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyMobileGA();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first Liveblog article of News18 Urdu HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGAComscore() {
		pages.urduMobileLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyMobileGA();   //It will verify GA is present with 200 status code
	}


	// --------------------- Comscore Validation --------------------------------//


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Urdu Home Page 
	 *
	 */
	@Test
	public void verifyUrduHomePageComscore() {
		pages.gaComscoreValidation.verifyMobileComscore();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Home Page 
	 *
	 */
	@Test
	public void verifyUrduFirstArticleComscore() {
		pages.urduMobileLandingPage.clickOnFirstArticleUrduHomePage();   //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyMobileComscore();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.urduMobileLandingPage.clickOnSportsSection();   //click on sport link present in home page
		pages.mobileUrduSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sport Page
		pages.gaComscoreValidation.verifyMobileComscore();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleComscore() {
		pages.urduMobileLandingPage.clickOnNationsSection();   //click on Nation section present in home page
		pages.mobileUrduSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyMobileComscore();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.urduMobileLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyMobileComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.urduMobileLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileUrduVideoPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyMobileComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Urdu HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.urduMobileLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyMobileComscore();   //It will verify GA is present with 200 status code
	}
}
