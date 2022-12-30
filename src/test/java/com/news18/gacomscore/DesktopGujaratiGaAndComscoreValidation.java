package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Gujarati
 */
public class DesktopGujaratiGaAndComscoreValidation extends DesktopCommonConfig {

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
		pages.desktopGujaratiLandingPage.clickOnFirstArticleHomePage();    //It will click on First Article Of Gujarati Home Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopGujaratiLandingPage.clickOnSportsLnk();   //It will click on sports link present in Gujarati home page
		pages.desktopGujaratiSportsPage.clickOnFirstArticleSportsPage();    //It will click on First Article Of Gujarati sports Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopGujaratiLandingPage.clickOnFirstSection();    //Click on first section of Home Page.
		pages.desktopGujaratiSectionPage.clickOnFirstArticleSectionPage();   //Click on First Article of section Page.
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopGujaratiLandingPage.clickOnPhotosSection();//Click on photo section of Home Page.
		pages.desktopGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of Gujarati News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopGujaratiLandingPage.clickOnVideoLnk();//Click on video section of Home Page.
		pages.desktopGujaratiVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Gujarati HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopGujaratiLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Gujarati Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopGujaratiLandingPage.clickOnSportsLnk();//Click on sports section of Home Page.
		pages.desktopGujaratiSportsPage.clickOnFirstLiveBlogArticleSportsPage();//Click on First live blog Article of sports Page.
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Gujarati Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopGujaratiLandingPage.clickOnFirstTopicLnkTrendingTopics();//Click on First Article of trending topics of home Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Home Page 
	 *
	 */
	@Test
	public void verifyGujaratiFirstArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnFirstArticleHomePage();    //It will click on First Article Of Gujarati Home Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnSportsLnk();   //It will click on sports link present in Gujarati home page
		pages.desktopGujaratiSportsPage.clickOnFirstArticleSportsPage();    //It will click on First Article Of Gujarati sports Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnFirstSection();    //Click on first section of Home Page.
		pages.desktopGujaratiSectionPage.clickOnFirstArticleSectionPage();   //Click on First Article of section Page.
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first article of News18 Gujarati Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnPhotosSection();//Click on photo section of Home Page.
		pages.desktopGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of Gujarati News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnVideoLnk();//Click on video section of Home Page.
		pages.desktopGujaratiVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA Comscore on first Liveblog article of News18 Gujarati HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Gujarati Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnSportsLnk();//Click on sports section of Home Page.
		pages.desktopGujaratiSportsPage.clickOnFirstLiveBlogArticleSportsPage();//Click on First live blog Article of sports Page.
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Gujarati Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopGujaratiLandingPage.clickOnFirstTopicLnkTrendingTopics();//Click on First Article of trending topics of home Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}

}
