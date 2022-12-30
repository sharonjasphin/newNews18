package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Desktop English
 */
public class DesktopEnglishGaAndComscoreValidation extends DesktopCommonConfig {

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
	 * @author AnupamGupta
	 * This method is used to validate GA and Comscore on News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishHomePageGA() {
		pages.gaComscoreValidation.verifyGA();     //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishFirstArticleGA() {
		pages.desktopLandingPage.clickOnFirstArticleHomePage();  //It will click on First Article Of English Home Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.desktopLandingPage.clickOnCricketNextLnk();  //It will click on Cricketnext link present on the hamburger Menu.
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();  //It will click on First Article Of English CricketNext Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.ampSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of English india Page
		pages.gaComscoreValidation.verifyGA();   //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.desktopLandingPage.clickOnPhotosSection();//It will Click On Photo Section present on Line One Section
		pages.desktopphotoGalleryConsumptionPage.navigateToOldPhotogalleryFirstArticle();//It will click on First photo Article Of English photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first article of News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.desktopLandingPage.navigateToFirstVideosArticle();//It will navigate to  first video article
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18  HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.desktopLandingPage.clickOnCricketNextLnk();   //It will click on Cricketnext link present on the hamburger Menu.
		pages.ampCricketNextPage.clickOnLiveBlogArticleCricketNextPage();//It will navigate to  first live blog  article of cricket next page
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate GA on first Liveblog article of News18 Cricket next Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleGA() {
		pages.desktopLandingPage.clickOnFirstTopicLnkTrendingTopics();  //It will navigate to  first trending topics article
		pages.gaComscoreValidation.verifyGA();    //It will verify GA is present with 200 status code
	}
	
	
	//------------------------------- Comscore Validation ---------------------------------------//
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishHomePageComscore() {
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 English Home Page 
	 *
	 */
	@Test
	public void verifyEnglishFirstArticleComscore() {
		pages.desktopLandingPage.clickOnFirstArticleHomePage();  //It will click on First Article Of English Home Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Cricket Next Page 
	 *
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.desktopLandingPage.clickOnCricketNextLnk();  //It will click on Cricketnext link present on the hamburger Menu.
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();  //It will click on First Article Of English CricketNext Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Section Page 
	 *
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.ampSectionPage.clickOnFirstArticleSectionPage();  //It will click on First Article Of English india Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 Photosection Page 
	 *
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.desktopLandingPage.clickOnPhotosSection();//It will Click On Photo Section present on Line One Section
		pages.desktopphotoGalleryConsumptionPage.navigateToOldPhotogalleryFirstArticle();//It will click on First photo Article Of English photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first article of News18 video section Page 
	 *
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.desktopLandingPage.navigateToFirstVideosArticle();//It will navigate to  first video article
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18  HomePage 
	 *
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.gaComscoreValidation.verifyComscore();   //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Cricket next Page 
	 *
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.desktopLandingPage.clickOnCricketNextLnk();   //It will click on Cricketnext link present on the hamburger Menu.
		pages.ampCricketNextPage.clickOnLiveBlogArticleCricketNextPage();//It will navigate to  first live blog  article of cricket next page
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Comscore on first Liveblog article of News18 Cricket next Page 
	 *
	 */
	@Test
	public void verifyTopicFirstArticleComscore() {
		pages.desktopLandingPage.clickOnFirstTopicLnkTrendingTopics();  //It will navigate to  first trending topics article
		pages.gaComscoreValidation.verifyComscore();    //It will verify Comscore is present with 204 status code
	}
}
