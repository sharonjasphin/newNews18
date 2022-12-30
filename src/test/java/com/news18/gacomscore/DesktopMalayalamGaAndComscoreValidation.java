package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Malayalam
 */
public class DesktopMalayalamGaAndComscoreValidation extends DesktopCommonConfig{

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
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on News18 Malayalam Home Page 
	 *
	 */
	@Test
	public void verifyMalayalamHomePageGA() {
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Home Page 
	 *
	 */
	@Test
	public void verifyMalayalamFirstArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnFirstArticleHomePage();   //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnSportsLnk();   //click on sports link present in home page
		pages.desktopMalayalamSportsPage.clickOnFirstArticleSportsPage();  //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnFirstSectionLnk();  //Click on entertainment section of Home Page.
		pages.desktopMalayalamSectionPage.clickOnFirstArticleSectionPage();  //Click on First Article of entertainment Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnPhotosSection();//Click on photo section of Home Page.
		pages.desktopMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first article of Malayalam News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnVideoLnk();//Click on video section of Home Page.
		pages.desktopMalayalamVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Malayalam HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Malayalam Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnSportsLnk();//Click on sports section of Home Page.
		pages.desktopMalayalamSportsPage.clickOnFirstLiveBlogArticleSportsPage();//Click on First live blog Article of sports Page.
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Malayalam Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopMalayalamLandingPage.clickOnFirstTopicLnkTrendingTopics();//Click on First Article of trending topics of home Page.
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Malayalam Home Page 
	 *
	 */
	@Test
	public void verifyMalayalamHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Home Page 
	 *
	 */
	@Test
	public void verifyMalayalamFirstArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnFirstArticleHomePage();   //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnSportsLnk();   //click on sports link present in home page
		pages.desktopMalayalamSportsPage.clickOnFirstArticleSportsPage();  //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnFirstSectionLnk();  //Click on entertainment section of Home Page.
		pages.desktopMalayalamSectionPage.clickOnFirstArticleSectionPage();  //Click on First Article of entertainment Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnPhotosSection();//Click on photo section of Home Page.
		pages.desktopMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of Malayalam News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnVideoLnk();//Click on video section of Home Page.
		pages.desktopMalayalamVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Malayalam HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Malayalam Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnSportsLnk();//Click on sports section of Home Page.
		pages.desktopMalayalamSportsPage.clickOnFirstLiveBlogArticleSportsPage();//Click on First live blog Article of sports Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Malayalam Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopMalayalamLandingPage.clickOnFirstTopicLnkTrendingTopics();//Click on First Article of trending topics of home Page.
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}
}
