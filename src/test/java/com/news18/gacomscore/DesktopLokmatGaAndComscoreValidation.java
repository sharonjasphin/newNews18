package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Lokmat
 */
public class DesktopLokmatGaAndComscoreValidation extends DesktopCommonConfig {

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
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Home Page 
	 *
	 */
	@Test
	public void verifyLokmatFirstArticleGA() {
		pages.desktopLokmatLandingPage.clickOnFirstArticleHomePage();  //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopLokmatLandingPage.clickOnSportsLnk();  //click on sports link present on header part of home page
		pages.desktopLokmatSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopLokmatLandingPage.clickOnFirstSectionLnk();   //click on first section link on line one of home page
		pages.desktopLokmatSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopLokmatLandingPage.clickOnPhotosSection();//It will Click On Photo Section present on Line One Section
		pages.desktopLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;//It will click on First photo Article Of English photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopLokmatLandingPage.navigateToVideosSection();  //click on video section link present on header part of home page
		pages.desktopLokmatVideosPage.clickOnFirstVideoArticle();  // click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first Liveblog article of News18 Lokmat HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopLokmatLandingPage.clickOnLiveBlogArticleHomePage();  // click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Lokmat Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopLokmatLandingPage.clickOnSportsLnk();  //click on sports link present on header part of home page
		pages.desktopLokmatSportsPage.clickOnFirstLiveBlogArticleSportsPage();  // click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Lokmat Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopLokmatLandingPage.clickOnFirstTopicLnkTrendingTopics();  // click on First Article Of trending topics of home Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
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
		pages.desktopLokmatLandingPage.clickOnFirstArticleHomePage();  //It will click on First Article Of Home Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopLokmatLandingPage.clickOnSportsLnk();  //click on sports link present on header part of home page
		pages.desktopLokmatSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopLokmatLandingPage.clickOnFirstSectionLnk();   //click on first section link on line one of home page
		pages.desktopLokmatSectionPage.clickOnFirstArticleSectionPage();   //It will click on First Article Of section Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopLokmatLandingPage.clickOnPhotosSection();//It will Click On Photo Section present on Line One Section
		pages.desktopLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;//It will click on First photo Article Of English photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopLokmatLandingPage.navigateToVideosSection();  //click on video section link present on header part of home page
		pages.desktopLokmatVideosPage.clickOnFirstVideoArticle();  // click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();  //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Lokmat HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopLokmatLandingPage.clickOnLiveBlogArticleHomePage();  // click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Lokmat Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopLokmatLandingPage.clickOnSportsLnk();  //click on sports link present on header part of home page
		pages.desktopLokmatSportsPage.clickOnFirstLiveBlogArticleSportsPage();  // click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Lokmat Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopLokmatLandingPage.clickOnFirstTopicLnkTrendingTopics();  // click on First Article Of trending topics of home Page
		pages.gaComscoreValidation.verifyComscore();  //It will verify Comscore is present with 204 status code
	}

}
