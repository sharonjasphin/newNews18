package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of AMP Bengali
 */

public class AMPBengaliGaAndComscoreValidation extends MobileCommonConfig{
	
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
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String currentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(currentUrl);
		navigateToUrl(ampurl);
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to validate GA on News18 Bengali Home Page
	 */
	@Test
	public void verifyBengaliHomePageGA() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 *  This method is used to click on First Article of News18 Bengali Home Page and validate GA
	 */
	@Test
	public void verifyBengaliFirstArticleGA() {
		pages.mobileBengaliLandingPage.clickOnFirstArticleBengaliHomePage();// Click on First Article of Home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Bengali Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileBengaliLandingPage.clickOnSportsSection();// Click on cricketnext link of Home Page.
		pages.mobileBengaliCricketNextPage.clickCricketNxtFirstArticle();// Click on First Article of Cricketnext Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Bengali Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.mobileBengaliLandingPage.clickOnLineOneSection();
		pages.mobileBengaliSectionPage.clickOnFirstArticleSectionPage();// Click on First Article of entertainment Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Bengali PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileBengaliLandingPage.clickOnPhotoSection();// Click on photo section link of Home Page.
		pages.mobileBengaliPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();// Click on First Article of photo gallery consumption Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Bengali Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileBengaliLandingPage.clickOnVideosSection();// Click on video section link of Home Page.
		pages.mobileBengaliVideoSectionPage.clickOnFirstArticleVideosSectionPage();// Click on First Article of video Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileBengaliLandingPage.clickOnLiveBlogArticleHomePage();// Click on First Live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Bengali Home Page
	 */
	@Test
	public void verifyBengaliHomePageComscore() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 *  This method is used to click on First Article of News18 Bengali Home Page and validate Comscore
	 */
	@Test
	public void verifyBengaliFirstArticleComscore() {
		pages.mobileBengaliLandingPage.clickOnFirstArticleBengaliHomePage();// Click on First Article of Home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Bengali Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileBengaliLandingPage.clickOnSportsSection();// Click on cricketnext link of Home Page.
		pages.mobileBengaliCricketNextPage.clickCricketNxtFirstArticle();// Click on First Article of Cricketnext Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Bengali Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.mobileBengaliLandingPage.clickOnLineOneSection();
		pages.mobileBengaliSectionPage.clickOnFirstArticleSectionPage();// Click on First Article of entertainment Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Bengali PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileBengaliLandingPage.clickOnPhotoSection();// Click on photo section link of Home Page.
		pages.mobileBengaliPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();// Click on First Article of photo gallery consumption Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}
	
	

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Bengali Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileBengaliLandingPage.clickOnVideosSection();// Click on video section link of Home Page.
		pages.mobileBengaliVideoSectionPage.clickOnFirstArticleVideosSectionPage();// Click on First Article of video Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Bengali Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileBengaliLandingPage.clickOnLiveBlogArticleHomePage();// Click on First Live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}
}
