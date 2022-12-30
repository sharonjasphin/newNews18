package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Bengali
 */

public class DesktopBengaliGAandComscoreValidation extends DesktopCommonConfig{

	/**
	 * @author Abhishek Raj
	 *  This method is used to navigate to News18 Home Page for Bengali Language URL which is fetching from Property File
	 *  URL-https://bengali.news18.com/
	 */
//	@BeforeMethod
	public void navigateToBengaliHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA and Comscore on News18 Bengali Home Page
	 */
	@Test
	public void verifyBengaliHomePageGA() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 *  This method is used to click on First Article of News18 Bengali Home Page and validate GA
	 */
	@Test
	public void verifyBengaliFirstArticleGA() {
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();// Click on First Article of Home Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Bengali Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopBengaliLandingPage.clickOnCricketNextLnk();// Click on cricketnext link of Home Page.
		pages.desktopBengaliCricketNextPage.clickOnFirstArticleCricketNextPage();// Click on First Article of Cricketnext Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Bengali Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopBengaliSectionPage.clickOnFirstArticlSectionPage();// Click on First Article of entertainment Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Bengali PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopBengaliLandingPage.clickOnPhotoSection();// Click on photo section link of Home Page.
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();// Click on First Article of photo gallery consumption Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}



	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Bengali Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopBengaliLandingPage.navigateToVideosSection();// Click on video section link of Home Page.
		pages.desktopBengaliVideosPage.clickOnFirstVideoArticle();// Click on First Article of video Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopBengaliLandingPage.clickOnLiveBlogArticleHomePage();// Click on First Live blog Article of home Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Cricket Next Page and validate GA 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopBengaliLandingPage.clickOnCricketNextLnk();// Click on cricketnext link of Home Page.
		pages.desktopBengaliCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();// Click on First Live blog Article of cricketNext Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	
	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Bengali Home Page and validate GA
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopBengaliLandingPage.clickOnFirstTopicLnkTrendingTopics();// Click on first article of trending topics link of Home Page.
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Bengali Home Page
	 */
	@Test
	public void verifyBengaliHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 *  This method is used to click on First Article of News18 Bengali Home Page and validate Comscore
	 */
	@Test
	public void verifyBengaliFirstArticleComscore() {
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();// Click on First Article of Home Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Bengali Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopBengaliLandingPage.clickOnCricketNextLnk();// Click on cricketnext link of Home Page.
		pages.desktopBengaliCricketNextPage.clickOnFirstArticleCricketNextPage();// Click on First Article of Cricketnext Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Bengali Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopBengaliSectionPage.clickOnFirstArticlSectionPage();// Click on First Article of entertainment Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Bengali PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopBengaliLandingPage.clickOnPhotoSection();// Click on photo section link of Home Page.
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();// Click on First Article of photo gallery consumption Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}



	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Bengali Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopBengaliLandingPage.navigateToVideosSection();// Click on video section link of Home Page.
		pages.desktopBengaliVideosPage.clickOnFirstVideoArticle();// Click on First Article of video Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopBengaliLandingPage.clickOnLiveBlogArticleHomePage();// Click on First Live blog Article of home Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Cricket Next Page and validate Comscore 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopBengaliLandingPage.clickOnCricketNextLnk();// Click on cricketnext link of Home Page.
		pages.desktopBengaliCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();// Click on First Live blog Article of cricketNext Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Bengali Home Page and validate Comscore
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopBengaliLandingPage.clickOnFirstTopicLnkTrendingTopics();// Click on first article of trending topics link of Home Page.
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


}
