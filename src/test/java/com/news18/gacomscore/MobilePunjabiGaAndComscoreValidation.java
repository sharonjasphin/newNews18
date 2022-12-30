package com.news18.gacomscore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author AbhishekRaj
 *  This test Class contains scripts to verify the GA and Comscore, present in various pages
 * of Mobile Punjab
 */
public class MobilePunjabiGaAndComscoreValidation extends MobileCommonConfig{

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
	 * This method is used to validate GA on News18 Punjab Home Page
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
		pages.mobilePunjabLandingPage.clickOnFirstArticlePunjabHomePage();//It will click on First Article Of punjab Home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Punjab Language and validate GA 
	 */
	@Test
	public void verifyCricketNextArticleGA() {
		pages.mobilePunjabLandingPage.clickOnSportsSection();
		pages.mobilePunjabCricketNextPage.clickSportsFirstArticle();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Punjab Section Page and validate GA
	 */
	@Test
	public void verifySectionFirstArticleGA() {
		pages.mobilePunjabLandingPage.clickOnWorldsSection();//click on Cinema link present on line one of home page
		pages.mobilePunjabSectionPage.clickSectionFirstArticle();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Punjab PhotoGallery Consumption Page and validate GA
	 */
	@Test
	public void verifyPhotosFirstArticleGA() {
		pages.mobilePunjabLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Punjab Videos Page and validate GA
	 */
	@Test
	public void verifyVideoFirstArticleGA() {
		pages.mobilePunjabLandingPage.clickOnVideoSection();//click on video section link present on line one of home page
		pages.mobilePunjabVideoSectionPage.clickVideoSectionFirstArticle();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Homepage and validate GA 
	 */
	@Test
	public void verifyFirstLiveBLogArticleGA() {
		pages.mobilePunjabLandingPage.clickOnFirstLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Cricket Next Page and validate GA  
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleGA() {
		pages.mobilePunjabLandingPage.clickOnSportsSection();//click on sports section link present on line one of home page
		pages.mobilePunjabCricketNextPage.clickSportsFirstArticle();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyGA();//It will verify GA is present with 200 status code
	}


	// ---------------------------- Comscore Validation -----------------------------//


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
		pages.mobilePunjabLandingPage.clickOnFirstArticlePunjabHomePage();//It will click on First Article Of punjab Home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click on First Article of Cricket Next Page in Punjab Language and validate Comscore 
	 */
	@Test
	public void verifyCricketNextArticleComscore() {
		pages.mobilePunjabLandingPage.clickOnSportsSection();
		pages.mobilePunjabCricketNextPage.clickSportsFirstArticle();//It will click on First Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 *@author Abhishek Raj
	 *This method is used to click First Article of News18 Punjab Section Page and validate Comscore 
	 */
	@Test
	public void verifySectionFirstArticleComscore() {
		pages.mobilePunjabLandingPage.clickOnWorldsSection();//click on Cinema link present on line one of home page
		pages.mobilePunjabSectionPage.clickSectionFirstArticle();//It will click on First Article Of cinema Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to click First Article of News18 Punjab PhotoGallery Consumption Page and validate Comscore
	 */
	@Test
	public void verifyPhotosFirstArticleComscore() {
		pages.mobilePunjabLandingPage.clickOnPhotoSection();//click on photo section link present on line one of home page
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code 
	}

	/**
	 * @author Abhishek Raj
	 *This method is used to validate First Video Article News18 Punjab Videos Page and validate Comscore
	 */
	@Test
	public void verifyVideoFirstArticleComscore() {
		pages.mobilePunjabLandingPage.clickOnVideoSection();//click on video section link present on line one of home page
		pages.mobilePunjabVideoSectionPage.clickVideoSectionFirstArticle();//It will click on First Article Of video Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Homepage and validate Comscore
	 */
	@Test
	public void verifyFirstLiveBLogArticleComscore() {
		pages.mobilePunjabLandingPage.clickOnFirstLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to validate Live Blog News18 Punjab Cricket Next Page and validate Comscore 
	 */
	@Test
	public void verifyCricketNextLiveBlogArticleComscore() {
		pages.mobilePunjabLandingPage.clickOnSportsSection();//click on sports section link present on line one of home page
		pages.mobilePunjabCricketNextPage.clickSportsFirstArticle();//It will click on First live blog Article Of sports Page
		pages.gaComscoreValidation.verifyComscore();//It will verify Comscore is present with 204 status code
	}
}