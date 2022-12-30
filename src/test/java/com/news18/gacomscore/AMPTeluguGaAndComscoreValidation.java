package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * 
 * @author AbhishekRaj
 *This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of AMP Telugu
 */

public class AMPTeluguGaAndComscoreValidation extends MobileCommonConfig{

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
	 * This method is used to validate GA on News18 Telugu Home Page
	 */
//	@Test
	public void verifyTeluguHomePageGA() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Telugu Home Page and validate GA
	 */
	@Test
	public void verifyTeluguFirstArticleGA() {
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();//It will click on First Article Of telugu Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Telugu Language and validate GA
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileTeluguLandingPage.clickOnSportsSection();
		pages.mobileTeluguCricketNextPage.clickPhotogalleryFirstArticle();//It will click on First Article Of sports Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Telugu Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.mobileTeluguLandingPage.clickOnPoliticsSection();//click on Cinema link present on line one of home page
		pages.mobileTeluguSectionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of cinema Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Telugu PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileTeluguLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.mobileTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Telugu Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileTeluguLandingPage.clickOnVideosSection();//click on video section link present on line one of home page
		pages.mobileTeluguVideoSectionPage.clickvideoArticleLnk();//It will click on First Article Of video Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileTeluguLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Cricket Next Page and validate GA 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.mobileTeluguLandingPage.clickOnSportsSection();//click on sports section link present on line one of home page
		pages.mobileTeluguCricketNextPage.clickPhotogalleryFirstArticle();//It will click on First live blog Article Of sports Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	//------------------------------- Comscore Validation ---------------------------------------//


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Comscore on News18 Telugu Home Page
	 */
//	@Test
	public void verifyTeluguHomePageComscore() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}

	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of News18 Telugu Home Page and validate Comscore
	 */
	@Test
	public void verifyTeluguFirstArticleComscore() {
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();//It will click on First Article Of telugu Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Telugu Language and validate Comscore
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileTeluguLandingPage.clickOnSportsSection();
		pages.mobileTeluguCricketNextPage.clickPhotogalleryFirstArticle();//It will click on First Article Of sports Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Telugu Section Page and validate Comscore
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.mobileTeluguLandingPage.clickOnPoliticsSection();//click on Cinema link present on line one of home page
		pages.mobileTeluguSectionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of cinema Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Telugu PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileTeluguLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.mobileTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Telugu Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileTeluguLandingPage.clickOnVideosSection();//click on video section link present on line one of home page
		pages.mobileTeluguVideoSectionPage.clickvideoArticleLnk();//It will click on First Article Of video Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Homepage and validate Comscore 
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileTeluguLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Telugu Cricket Next Page and validate Comscore 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.mobileTeluguLandingPage.clickOnSportsSection();//click on sports section link present on line one of home page
		pages.mobileTeluguCricketNextPage.clickPhotogalleryFirstArticle();//It will click on First live blog Article Of sports Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


}


