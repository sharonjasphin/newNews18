package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Odia
 */

public class DesktopOdiaGaAndComscoreValidation extends DesktopCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for odia Language URL which is fetching from Property File
	 *  URL-https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA and Comscore on News18 Odia Home Page 
	 */
	@Test
	public void verifyOdiaHomePageGA() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Odia Home Page and validate GA
	 */
	@Test
	public void verifyOdiaFirstArticleGAComscore() {
		pages.desktopOdiaLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of odia Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code

	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Odia Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGAComscore() {
		pages.desktopOdiaLandingPage.clickOnSportsLnk();
		pages.desktopOdiaSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code

	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Odia Section Page and validate GA 
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopOdiaLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopOdiaSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click First Article of News18 Odia PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopOdiaLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Odia Videos Page and validate GA  
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopOdiaLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopOdiaVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Homepage and validate GA  
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopOdiaLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Cricket Next Page and validate GA   
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopOdiaLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopOdiaSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Odia Home Page and validate GA
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopOdiaLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Odia Home Page 
	 */
	@Test
	public void verifyOdiaHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Odia Home Page and validate Comscore
	 */
	@Test
	public void verifyOdiaFirstArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of odia Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code

	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Odia Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnSportsLnk();
		pages.desktopOdiaSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code

	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Odia Section Page and validate Comscore 
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopOdiaSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to click First Article of News18 Odia PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Odia Videos Page and validate Comscore  
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopOdiaVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Homepage and validate Comscore  
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Odia Cricket Next Page and validate Comscore   
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopOdiaSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Odia Home Page and validate Comscore
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopOdiaLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}
}


