package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Punjab
 */

public class DesktopPunjabiGaAndComscoreValidation extends DesktopCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for punjab Language URL which is fetching from Property File
	 *  URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
	public void navigateTopunjabHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA and Comscore on News18 Punjab Home Page
	 */
	@Test
	public void verifyPunjabHomePageGA() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Punjab Home Page and validate GA
	 */
	@Test
	public void verifyPunjabFirstArticleGA() {
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of punjab Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Punjab Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopPunjabLandingPage.clickOnSportsLnk();
		pages.desktopPunjabSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Punjab Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopPunjabLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopPunjabSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Punjab PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopPunjabLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Punjab Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopPunjabLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopPunjabVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopPunjabLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Cricket Next Page and validate GA 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopPunjabLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopPunjabSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Punjab Home Page and validate GA
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopPunjabLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Punjab Home Page
	 */
	@Test
	public void verifyPunjabHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Punjab Home Page and validate Comscore
	 */
	@Test
	public void verifyPunjabFirstArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of punjab Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Punjab Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnSportsLnk();
		pages.desktopPunjabSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Punjab Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopPunjabSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Punjab PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Punjab Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopPunjabVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Cricket Next Page and validate Comscore 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopPunjabSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *  This method is used to validate First Trending Topics of News18 Punjab Home Page and validate Comscore
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopPunjabLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}
}


