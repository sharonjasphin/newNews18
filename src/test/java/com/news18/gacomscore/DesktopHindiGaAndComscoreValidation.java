package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Hindi
 */

public class DesktopHindiGaAndComscoreValidation extends DesktopCommonConfig{

	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to News18 Home Page for Hindi Language URL which is fetching from Property File
	 *  URL-https://www.hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA on News18 Hindi Home Page
	 */ 
	@Test
	public void verifyHindiHomePageGA() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Hindi Home Page and validate GA
	 */
	@Test
	public void verifyFirstArticleHomePageGA() {
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of assam Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code

	}

	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Hindi Language and validate GA
	 */
	@Test
	public void verifyFirstArticleSportsGA() {
		pages.desktopHindiLandingPage.clickOnCricketNextLnk();
		pages.desktopHindiCricketNextPage.clickOnFirstArticleCricketNextPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi Section Page and validate GA
	 */
	@Test
	public void verifyFirstArticleSectionGA() {
		pages.desktopHindiSectionPage.clickOnFirstArticleSectionPage();//click on First Article Of entertainment  Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * 
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyFirstArticlePhotosGA() {
		pages.desktopHindiLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Hindi Videos Page and validate Comscore
	 *    
	 */
	@Test
	public void verifyFirstVideosArticleGA() {
		pages.desktopHindiLandingPage.navigateToVideosSection();//click on video section link present on line one of home page
		pages.desktopHindiVideosPage.clickOnFirstVideoArticle();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Hindi Homepage and validate GA
	 * 
	 */
	@Test
	public void verifyFirstLiveBlogHomePageGA() {
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Hindi Cricket Next Page and validate GA
	 */
	@Test
	public void verifyFirstLiveBlogCricketNextPageGA() {
		pages.desktopHindiLandingPage.clickOnCricketNextLnk();//Click on cricketnext section of Home Page.
		pages.desktopHindiCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();//It will navigate to  first live blog article on cricketnext page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Trending Topics of News18 Hindi Home Page and validate GA 
	 */
	@Test
	public void verifyFirstArticleTrendingTopicsGA() {
		pages.desktopHindiLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will navigate to  first  article on trending topics page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Hindi Home Page
	 */ 
	@Test
	public void verifyHindiHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code	
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Hindi Home Page and validate Comscore
	 */
	@Test
	public void verifyFirstArticleHomePageComscore() {
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of assam Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Hindi Language and validate Comscore
	 */
	@Test
	public void verifyFirstArticleSportsComscore() {
		pages.desktopHindiLandingPage.clickOnCricketNextLnk();
		pages.desktopHindiCricketNextPage.clickOnFirstArticleCricketNextPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi Section Page and validate Comscore
	 */
	@Test
	public void verifyFirstArticleSectionComscore() {
		pages.desktopHindiSectionPage.clickOnFirstArticleSectionPage();//click on First Article Of entertainment  Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * 
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyFirstArticlePhotosComscore() {
		pages.desktopHindiLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Hindi Videos Page and validate Comscore
	 *    
	 */
	@Test
	public void verifyFirstVideosArticleComscore() {
		pages.desktopHindiLandingPage.navigateToVideosSection();//click on video section link present on line one of home page
		pages.desktopHindiVideosPage.clickOnFirstVideoArticle();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Hindi Homepage and validate Comscore
	 * 
	 */
	@Test
	public void verifyFirstLiveBlogHomePageComscore() {
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Hindi Cricket Next Page and validate Comscore
	 */
	@Test
	public void verifyFirstLiveBlogCricketNextPageComscore() {
		pages.desktopHindiLandingPage.clickOnCricketNextLnk();//Click on cricketnext section of Home Page.
		pages.desktopHindiCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();//It will navigate to  first live blog article on cricketnext page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Trending Topics of News18 Hindi Home Page and validate Comscore 
	 */
	@Test
	public void verifyFirstArticleTrendingTopicsComscore() {
		pages.desktopHindiLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will navigate to  first  article on trending topics page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}
}
