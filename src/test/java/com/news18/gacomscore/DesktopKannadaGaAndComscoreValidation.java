package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Kannada
 */
public class DesktopKannadaGaAndComscoreValidation extends DesktopCommonConfig{

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
	 *
	 */
	@Test
	public void verifyKannadaHomePageGA() {
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada Home Page 
	 *
	 */
	@Test
	public void verifyKannadaFirstArticleGA() {
		pages.desktopKannadaLandingPage.clickOnFirstArticleHomePage();  //It will click on First Article Of kannada Home Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopKannadaLandingPage.clickOnSportsLnk();  //click on sports section link present on line one of home page
		pages.desktopKannadaSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();     //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first article of News18 Kannada Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopKannadaLandingPage.clickOnFirstSectionLnk();  //click on Cinema link present on line one of home page
		pages.desktopKannadaSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of Section Page
		pages.gaComscoreValidation.verifyGA();     //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopKannadaLandingPage.clickOnPhotosSection();  //click on photo section link present on line one of home page
		pages.desktopKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle(); //It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();     //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of Kannada News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopKannadaLandingPage.clickOnVideoLnk();  //click on video section link present on line one of home page
		pages.desktopKannadaVideosPage.clickOnFirstArticleVideoPage();  //It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();     //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Kannada HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopKannadaLandingPage.clickOnLiveBlogArticleHomePage();  //It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Kannada Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopKannadaLandingPage.clickOnSportsLnk();   //click on sports section link present on line one of home page
		pages.desktopKannadaSportsPage.clickOnFirstLiveBlogArticleSportsPage();   //It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Kannada Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopKannadaLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
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
		pages.desktopKannadaLandingPage.clickOnFirstArticleHomePage();  //It will click on First Article Of kannada Home Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopKannadaLandingPage.clickOnSportsLnk();  //click on sports section link present on line one of home page
		pages.desktopKannadaSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopKannadaLandingPage.clickOnFirstSectionLnk();  //click on Cinema link present on line one of home page
		pages.desktopKannadaSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of Section Page
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first article of News18 Kannada Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopKannadaLandingPage.clickOnPhotosSection();  //click on photo section link present on line one of home page
		pages.desktopKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle(); //It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of Kannada News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopKannadaLandingPage.clickOnVideoLnk();  //click on video section link present on line one of home page
		pages.desktopKannadaVideosPage.clickOnFirstArticleVideoPage();  //It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Kannada HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopKannadaLandingPage.clickOnLiveBlogArticleHomePage();  //It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Kannada Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopKannadaLandingPage.clickOnSportsLnk();   //click on sports section link present on line one of home page
		pages.desktopKannadaSportsPage.clickOnFirstLiveBlogArticleSportsPage();   //It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Kannada Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopKannadaLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyComscore();     //It will verify Comscore is present with 204 status code
	}
}
