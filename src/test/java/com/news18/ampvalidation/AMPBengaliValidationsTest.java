package com.news18.ampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of Bengali Amp
 * URL by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AMPBengaliValidationsTest extends  DesktopCommonConfig{

	/**
	 * @author SanjeebKumarPati
	 *  This method is used to navigate to News18 Home Page for
	 *  Bengali Language URL which is fetching from Property File
	 *  URL-https://bengali.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToBengaliHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 Bengali Home
	 * Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void bengaliHomePage() {
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on News18
	 * Bengali Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopBengaliLandingPage.clickOnFirstArticleHomePage();// Click on First Article of Home Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 Bengali
	 * sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopBengaliLandingPage.clickOnCricketNextLnk();// Click on cricketnext link of Home Page.
		pages.desktopBengaliCricketNextPage.clickOnFirstArticleCricketNextPage();// Click on First Article of Cricketnext Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *Bengali Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopBengaliSectionPage.clickOnFirstArticlSectionPage();// Click on First Article of entertainment Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Bengali Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.desktopBengaliLandingPage.clickOnPhotoSection();// Click on photo section link of Home Page.
		pages.desktopBengaliPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();// Click on First Article of photo gallery consumption Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on
	 * News18 Bengali Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopBengaliLandingPage.navigateToVideosSection();// Click on video section link of Home Page.
		pages.desktopBengaliVideosPage.clickOnFirstVideoArticle();// Click on First Article of video Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Bengali Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopBengaliLandingPage.clickOnLiveBlogArticleHomePage();// Click on First Live blog Article of home Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Bengali Cricket Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.desktopBengaliLandingPage.clickOnCricketNextLnk();// Click on cricketnext link of Home Page.
		pages.desktopBengaliCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();// Click on First Live blog Article of cricketNext Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Trending Topics Article AMP 
	 * url on News18 Bengali Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopBengaliLandingPage.clickOnFirstTopicLnkTrendingTopics();// Click on first article of trending topics link of Home Page.
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
//	}
}