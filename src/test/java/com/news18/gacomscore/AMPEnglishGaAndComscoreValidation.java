package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of AMP English
 */
public class AMPEnglishGaAndComscoreValidation extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to News18 Home Page for English Language URL which is fetching from Property File
	 *  URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
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
	 * @author AnupamGupta
	 * This method is used to validate GA on News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishHomePageGA() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();  //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishFirstArticleGA() {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();   //It will click on First Article Of Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileLandingPage.clickOnCricketNextSection();   //click on cricketNext link present in home page
		pages.mobileCricketNextPage.clickOnFirstArticleCricketNextPage();   //It will click on First Article Of cricketNext Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleGA() {
		pages.mobileLandingPage.clickOnIndiaSection();   //click on india section present in home page
		pages.mobileSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of india section Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileVideosArticlePage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18  HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.mobileLandingPage.clickOnFooterTopics();//It will navigate to  first trending topics article
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();   //It will verify GA is present with 200 status code
	}

	
	//------------------------------- Comscore Validation ---------------------------------------//


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishHomePageComscore() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishFirstArticleComscore() {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();   //It will click on First Article Of Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileLandingPage.clickOnCricketNextSection();   //click on cricketNext link present in home page
		pages.mobileCricketNextPage.clickOnFirstArticleCricketNextPage();   //It will click on First Article Of cricketNext Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Section Page 
	 *
	 */
	@Test
	public void verifySectionArticleComscore() {
		pages.mobileLandingPage.clickOnIndiaSection();   //click on india section present in home page
		pages.mobileSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of india section Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileLandingPage.clickOnVideoSection();//Click on video section of Home Page.
		pages.mobileVideosArticlePage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18  HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Topic Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.mobileLandingPage.clickOnFooterTopics();//It will navigate to  first trending topics article
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}
}
