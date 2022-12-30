package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of AMP Malayalam
 */
public class AMPMalayalamGaAndComscoreValidation extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to News18 Home Page for Malayalam Language URL which is fetching from Property File
	 *  URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToMalayalamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
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
	 * This method is used to validate GA on News18 Malayalam Home Page 
	 *
	 */
//	@Test
	public void verifyMalayalamHomePageGA() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Home Page 
	 *
	 */
	@Test
	public void verifyMalayalamFirstArticleGA() {
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();   //It will click on First Article Of Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileMalayalamLandingPage.clickOnSportsLnk();   //click on sports link present in home page
		pages.mobileMalayalamSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		changeToAmpURL(); 
		pages.gaComscoreAMPValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleGA() {
		pages.mobileMalayalamLandingPage.clickOnIndiaSection();   //click on India section present in home page
		pages.mobileMalayalamSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileMalayalamLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileMalayalamVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Malayalam HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileMalayalamLandingPage.clickOnFirstLiveBlogArticleMalayalamHomePage();//Click on First live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Malayalam Home Page 
	 *
	 */
//	@Test
	public void verifyMalayalamHomePageComscore() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Home Page 
	 *
	 */
	@Test
	public void verifyMalayalamFirstArticleComscore() {
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();   //It will click on First Article Of Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileMalayalamLandingPage.clickOnSportsLnk();   //click on sports link present in home page
		pages.mobileMalayalamSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		changeToAmpURL(); 
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleComscore() {
		pages.mobileMalayalamLandingPage.clickOnIndiaSection();   //click on India section present in home page
		pages.mobileMalayalamSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam photos Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileMalayalamLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileMalayalamVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Malayalam HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileMalayalamLandingPage.clickOnFirstLiveBlogArticleMalayalamHomePage();//Click on First live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}
}
