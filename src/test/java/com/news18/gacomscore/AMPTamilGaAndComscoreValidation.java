package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of AMP Tamil
 */

public class AMPTamilGaAndComscoreValidation extends MobileCommonConfig{
	
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
	 * This method is used to validate GA on News18 Tamil Language Home Page
	 */
//	@Test
	public void verifyTamilHomePageGA() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Tamil Home Page and validate GA
	 */
	@Test
	public void verifyTamilFirstArticleGA() {
		pages.mobileTamilLandingPage.clickOnFirstArticleTamilHomePage();//It will click on First Article Of tamil Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Tamil Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileTamilLandingPage.clickOnSportsLnk();
		pages.mobileTamilCricketNextPage.clickSportsFirstArticle();
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Tamil Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.mobileTamilLandingPage.clickOnLineOneSection();//click on Cinema link present on line one of home page
		pages.mobileTamilSectionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of cinema Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}



	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Tamil PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileTamilLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Tamil Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileTamilLandingPage.clickOnVideosSection();//click on video section link present on line one of home page
		pages.mobileTamilVideoSectionPage.clickvideoArticleLnk();//It will click on First Article Of video Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Tamil Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileTamilLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Tamil Language Home Page
	 */
//	@Test
	public void verifyTamilHomePageComscore() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Tamil Home Page and validate Comscore
	 */
	@Test
	public void verifyTamilFirstArticleComscore() {
		pages.mobileTamilLandingPage.clickOnFirstArticleTamilHomePage();//It will click on First Article Of tamil Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Tamil Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileTamilLandingPage.clickOnSportsLnk();
		pages.mobileTamilCricketNextPage.clickSportsFirstArticle();
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Tamil Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.mobileTamilLandingPage.clickOnLineOneSection();//click on Cinema link present on line one of home page
		pages.mobileTamilSectionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of cinema Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}



	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Tamil PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileTamilLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.mobileTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Tamil Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileTamilLandingPage.clickOnVideosSection();//click on video section link present on line one of home page
		pages.mobileTamilVideoSectionPage.clickvideoArticleLnk();//It will click on First Article Of video Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Tamil Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileTamilLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


}


