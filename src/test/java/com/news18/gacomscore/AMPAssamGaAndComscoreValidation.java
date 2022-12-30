package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * 
 * @author AbhishekRaj
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 */
public class AMPAssamGaAndComscoreValidation extends MobileCommonConfig{
	
	/**
	 * @author Abhishek Raj
	 * This method is used for navigate to Assam Home page URL which is fetching from Property File
	 * URL-https://assam.news18.com/
	 */
//	@BeforeMethod
	public void navigateToAssamHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
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
	 * @author AbhishekRaj
	 * This method is used to validate GA on News18 Assam Home Page 
	 */
//	@Test
	public void verifyAssamHomePageGA() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate GA on first article of News18 Assam Home Page 
	 */
	@Test
	public void verifyAssamFirstArticleGA() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();//It will click on First Article Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate GA on first article of News18 Assam photo section Page
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobileAssamLandingPage.clickOnPhotoSection();       //It will click on photo section Of Assam Home Page
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate GA on first article of News18 Assam section Page
	 */
	@Test
	public void  verifySectionFirstArticleGA() {
		pages.mobileAssamLandingPage.clickOnLineOneSection();      //It will click on photo section Of Assam Home Page
		pages.mobileAssamSectionPage.clickSectionFirstArticle();
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate GA on first live Blog article of News18 Assam Home Page
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobileAssamLandingPage.clickOnLiveBlogArticleHomePage(); //It will click on photo section Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author AbhishekRaj
	 * This method is used to validate GA on first article of News18 Assam sports section Page 
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobileAssamLandingPage.clickOnSports(); 
		pages.mobileAssamCricketNextPage.clickCricketNextFirstArticle();//It will click on photo section Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	/**
	 * @author AbhishekRaj
	 * This method is used to validate GA on first article of News18 Assam video section Page
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobileAssamLandingPage.clickOnVideos();
		pages.mobileAssamVideoSectionPage.clickVideoSectionFirstArticle();//It will click on photo section Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyGA();//It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author AbhishekRaj
	 * This method is used to validate Comscore on News18 Assam Home Page 
	 */
//	@Test
	public void verifyAssamHomePageComscore() {
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify advertisements is displayed 
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate Comscore on first article of News18 Assam Home Page 
	 */
	@Test
	public void verifyAssamFirstArticleComscore() {
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();//It will click on First Article Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to validate Comscore on first article of News18 Assam photo section Page
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobileAssamLandingPage.clickOnPhotoSection();       //It will click on photo section Of Assam Home Page
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate Comscore on first article of News18 Assam section Page
	 */
	@Test
	public void  verifySectionFirstArticleComscore() {
		pages.mobileAssamLandingPage.clickOnLineOneSection();      //It will click on photo section Of Assam Home Page
		pages.mobileAssamSectionPage.clickSectionFirstArticle();
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to validate Comscore on first live Blog article of News18 Assam Home Page
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobileAssamLandingPage.clickOnLiveBlogArticleHomePage(); //It will click on photo section Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}

	/**
	 * @author AbhishekRaj
	 * This method is used to validate Comscore on first article of News18 Assam sports section Page
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobileAssamLandingPage.clickOnSports(); 
		pages.mobileAssamCricketNextPage.clickCricketNextFirstArticle();//It will click on photo section Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}
	
	/**
	 * @author AbhishekRaj
	 * This method is used to validate Comscore on first article of News18 Assam video section Page
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobileAssamLandingPage.clickOnVideos();
		pages.mobileAssamVideoSectionPage.clickVideoSectionFirstArticle();//It will click on photo section Of Assam Home Page
		changeToAmpURL();
		pages.gaComscoreAMPValidation.verifyComscore(); //It will verify Comscore is present with 204 status code
	}
}

	
	


