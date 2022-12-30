package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of AMP Gujarati
 */
public class AMPGujaratiGaAndComscoreValidation extends MobileCommonConfig {

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
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String currentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(currentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on News18 Gujarati Home Page 
	 *
	 */
//	@Test
	public void verifyGujaratiHomePageGA() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiFirstArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();   //It will click on First Article Of Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnSportsLnk();   //click on sports link present in home page
		pages.mobileGujaratiSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnFirstSection();  //click on first section present in home page
		pages.mobileGujaratiSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
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
		changeToAmpURL(); 
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
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
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Gujarati HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();//Click on First live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Gujarati Home Page 
	 *
	 */
//	@Test
	public void verifyGujaratiHomePageComscore() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiFirstArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnFirstArticleGujaratiHomePage();   //It will click on First Article Of Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnSportsLnk();   //click on sports link present in home page
		pages.mobileGujaratiSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnFirstSection();  //click on first section present in home page
		pages.mobileGujaratiSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
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
		changeToAmpURL(); 
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
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
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();  //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Gujarati HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileGujaratiLandingPage.clickOnFirstLiveBlogArticleGujaratiHomePage();//Click on First live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}
}
