package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 *  This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Hindi
 */
public class MobileHindiGaAndComscoreValidation extends MobileCommonConfig{

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
	public void verifyHindiFirstArticleGA() {
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();;//It will click on First Article Of assam Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code

	}

	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Hindi Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileHindiLandingPage.clickOnSportsSection();
		pages.mobileHindiCricketNextPage.clickOnFirstArticleCricketNextPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.mobileHindiLandingPage.clickOnLineOneSection();	//click on First Article Of entertainment  Page
		pages.mobileHindiSectionPage.clickOnFirstSectionArticle();
		pages.gaComscoreValidation.verifyGA();	//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileHindiLandingPage.clickOnPhotoSection();	//click on photo section link present on line one of home page
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();	//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();	//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Hindi Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileHindiLandingPage.clickOnVideosSection();//click on video section link present on line one of home page
		pages.mobileHindiVideoSectionPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Hindi Homepage and validate GA
	 * 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();//It will navigate to  first live blog article
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Trending Topics of News18 Hindi Home Page and validate GA 
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.mobileHindiLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will navigate to  first  article on trending topics page
		pages.gaComscoreValidation.verifyGA();
	}


	//------------------------------- Comscore Validation ---------------------------------//


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Hindi Home Page
	 */ 
	@Test
	public void verifyHindiHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();	//It will verify Comscore is present with 204 status code

	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Hindi Home Page and validate Comscore
	 */
	@Test
	public void verifyHindiFirstArticleComscore() {
		pages.mobileHindiLandingPage.clickOnFirstArticleHindiHomePage();;//It will click on First Article Of assam Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code

	}

	/**
	 * @author Abhishek Raj
	 *This method is used to click on First Article of Cricket Next Page in Hindi Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileHindiLandingPage.clickOnSportsSection();
		pages.mobileHindiCricketNextPage.clickOnFirstArticleCricketNextPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.mobileHindiLandingPage.clickOnLineOneSection();//click on First Article Of entertainment  Page
		pages.mobileHindiSectionPage.clickOnFirstSectionArticle();
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}


	/**
	 * 
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Hindi PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileHindiLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.mobileHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Video Article News18 Hindi Videos Page and validate Comscore
	 *    
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileHindiLandingPage.clickOnVideosSection();//click on video section link present on line one of home page
		pages.mobileHindiVideoSectionPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Hindi Homepage and validate Comscore
	 * 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileHindiLandingPage.clickOnFirstLiveBlogArticleHindiHomePage();//It will navigate to  first live blog article
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate First Trending Topics of News18 Hindi Home Page and validate Comscore 
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.mobileHindiLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will navigate to  first  article on trending topics page
		pages.gaComscoreValidation.verifyComscore();
	}
}
