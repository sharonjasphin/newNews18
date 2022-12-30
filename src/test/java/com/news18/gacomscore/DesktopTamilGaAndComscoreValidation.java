package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Tamil
 */

public class DesktopTamilGaAndComscoreValidation extends DesktopCommonConfig{

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for Tamil Language URL which is fetching from Property File
	 *  URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA on News18 Tamil Language Home Page
	 */
	@Test
	public void verifyTamilHomePageGA() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Tamil Home Page and validate GA
	 */
	@Test
	public void verifyTamilFirstArticleGA() {
		pages.desktopTamilLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of tamil Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Tamil Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopTamilLandingPage.clickOnSportsLnk();
		pages.desktopTamilSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Tamil Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopTamilLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopTamilSectionPage.clickOnFirstArticlePage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Tamil PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopTamilLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Tamil Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopTamilLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopTamilVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Tamil Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopTamilLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Tamil Cricket Next Page and validate GA 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopTamilLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopTamilSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Tamil Home Page and validate GA
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopTamilLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Tamil Language Home Page
	 */
	@Test
	public void verifyTamilHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Tamil Home Page and validate Comscore
	 */
	@Test
	public void verifyTamilFirstArticleComscore() {
		pages.desktopTamilLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of tamil Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Tamil Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopTamilLandingPage.clickOnSportsLnk();
		pages.desktopTamilSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Tamil Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopTamilLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopTamilSectionPage.clickOnFirstArticlePage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}



	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Tamil PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopTamilLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Tamil Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopTamilLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopTamilVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Tamil Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopTamilLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Tamil Cricket Next Page and validate Comscore 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopTamilLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopTamilSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Tamil Home Page and validate Comscore
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopTamilLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

}



