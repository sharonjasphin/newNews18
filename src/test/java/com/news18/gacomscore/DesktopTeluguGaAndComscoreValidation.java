package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Telugu
 */
public class DesktopTeluguGaAndComscoreValidation extends  DesktopCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for telugu Language URL which is fetching from Property File
	 *  URL-https://telugu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToTeluguHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA on News18 Telugu Home Page
	 */
	@Test
	public void verifyTeluguHomePageGAComscore() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Telugu Home Page and validate GA
	 */
	@Test
	public void verifyTeluguFirstArticleGAComscore() {
		pages.desktopTeluguLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of telugu Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Telugu Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGAComscore() {
		pages.desktopTeluguLandingPage.clickOnSportsLnk();
		pages.desktopTeluguSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Telugu Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopTeluguLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopTeluguSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Telugu PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopTeluguLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Telugu Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopTeluguLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopTeluguVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopTeluguLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Cricket Next Page and validate GA 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopTeluguLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopTeluguSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Telugu Home Page and validate GA
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopTeluguLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Telugu Home Page
	 */
	@Test
	public void verifyTeluguHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Telugu Home Page and validate Comscore
	 */
	@Test
	public void verifyTeluguFirstArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of telugu Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Telugu Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnSportsLnk();
		pages.desktopTeluguSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Telugu Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopTeluguSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Telugu PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Telugu Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopTeluguVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Cricket Next Page and validate Comscore 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopTeluguSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Telugu Home Page and validate Comscore
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopTeluguLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}
}





