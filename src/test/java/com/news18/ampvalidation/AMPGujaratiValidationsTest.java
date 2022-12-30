package com.news18.ampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of Gujarati Amp URL
 * by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPGujaratiValidationsTest extends DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 *  This method is used to navigate to News18 Home Page for 
	 *  Gujarati Language URL which is fetching from Property File
	 *  URL-https://gujarati.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToGujaratiHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 Gujarati 
	 * Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
//	@Test
//	public void gujaratiHomePage() {
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());
//	}

	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP urls on News18 
	 *Gujarati Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopGujaratiLandingPage.clickOnFirstArticleHomePage();// Click on First Article of Home Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Gujarati sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopGujaratiLandingPage.clickOnSportsLnk();//Click on sports section of Home Page.
		pages.desktopGujaratiSportsPage.clickOnFirstArticleSportsPage();//Click on First Article of sports Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *Gujarati Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopGujaratiLandingPage.clickOnFirstSection();//Click on entertainment section of Home Page.
		pages.desktopGujaratiSectionPage.clickOnFirstArticleSectionPage();//Click on First Article of entertainment Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Gujarati Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticlePhotoGalleryAMPValidation() {
		pages.desktopGujaratiLandingPage.clickOnPhotosSection();//Click on photo section of Home Page.
		pages.desktopGujaratiPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}

	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Video Article AMP url on News18 
	 *Gujarati Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopGujaratiLandingPage.clickOnVideoLnk();//Click on video section of Home Page.
		pages.desktopGujaratiVideosPage.clickOnFirstArticleVideoPage();//Click on First Article of video Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Gujarati Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopGujaratiLandingPage.clickOnLiveBlogArticleHomePage();//Click on First live blog Article of home Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate Live Blog AMP url on News18 
	 *Gujarati Sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/    
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.desktopGujaratiLandingPage.clickOnSportsLnk();//Click on sports section of Home Page.
		pages.desktopGujaratiSportsPage.clickOnFirstLiveBlogArticleSportsPage();//Click on First live blog Article of sports Page.
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Trending Topics Article
	 * AMP url on News18 Gujarati Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopGujaratiLandingPage.clickOnFirstTopicLnkTrendingTopics();//Click on First Article of trending topics of home Page.
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not
//	}
}
