package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop Assam
 */

public class DesktopAssamGaAndComscoreValidation extends DesktopCommonConfig{


	/**
	 *@author Abhishek Raj
	 *This method is used to navigate to News18 Home Page for assam Language URL which is fetching from Property File
	 *URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToassamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA on News18 Assam Home Page
	 */
	@Test
	public void verifyAssamHomePageGA() {
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam Home Page and validate GA
	 */
	@Test
	public void verifyAssamFirstArticleGA() {
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of assam Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Assam Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopAssamLandingPage.clickOnSportsLnk();
		pages.desktopAssamSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Assam Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.desktopAssamLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopAssamSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Assam PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopAssamLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Assam Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopAssamLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopAssamVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Assam Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopAssamLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Cricket Next Page and validate GA
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopAssamLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopAssamSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Assam Home Page
	 */
	@Test
	public void verifyAssamHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Assam Home Page and validate Comscore
	 */
	@Test
	public void verifyAssamFirstArticleComscore() {
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of assam Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Assam Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopAssamLandingPage.clickOnSportsLnk();
		pages.desktopAssamSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Assam Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.desktopAssamLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopAssamSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Assam PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopAssamLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Assam Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopAssamLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopAssamVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Assam Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopAssamLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Cricket Next Page and validate Comscore 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopAssamLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopAssamSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}
}
