package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Urdu
 */
public class DesktopUrduGaAndComscoreValidation extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to News18 Home Page for Urdu Language URL which is fetching from Property File
	 *  URL-https://urdu.news18.com/
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
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Home Page 
	 *
	 */
	@Test
	public void verifyUrduFirstArticleGA() {
		pages.desktopUrduLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of urdu Home Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopUrduLandingPage.clickOnSportsLnk();    //click on sports link present on home page
		pages.desktopUrduSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopUrduLandingPage.clickOnFirstSectionLnk();  //click on Cinema link present on line one of home page
		pages.desktopUrduSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopUrduLandingPage.clickOnPhotosSection();  //click on photo section link present on line one of home page
		pages.desktopUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();  //It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on first article of Urdu News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopUrduLandingPage.clickOnVideoLnk();  //click on video section link present on line one of home page
		pages.desktopUrduVideosPage.clickOnFirstArticleVideoPage();  //It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Urdu HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopUrduLandingPage.clickOnLiveBlogArticleHomePage();  //It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Urdu Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopUrduLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopUrduSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Urdu Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopUrduLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 Urdu Home Page 
	 *
	 */
	@Test
	public void verifyUrduHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Home Page 
	 *
	 */
	@Test
	public void verifyUrduFirstArticleComscore() {
		pages.desktopUrduLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of urdu Home Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopUrduLandingPage.clickOnSportsLnk();    //click on sports link present on home page
		pages.desktopUrduSportsPage.clickOnFirstArticleSportsPage();   //It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopUrduLandingPage.clickOnFirstSectionLnk();  //click on Cinema link present on line one of home page
		pages.desktopUrduSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopUrduLandingPage.clickOnPhotosSection();  //click on photo section link present on line one of home page
		pages.desktopUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();  //It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of Urdu News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopUrduLandingPage.clickOnVideoLnk();  //click on video section link present on line one of home page
		pages.desktopUrduVideosPage.clickOnFirstArticleVideoPage();  //It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();  //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Urdu HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopUrduLandingPage.clickOnLiveBlogArticleHomePage();  //It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Urdu Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopUrduLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopUrduSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Urdu Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopUrduLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyComscore();  //It will verify Comscore is present with 204 status code
	}
}
