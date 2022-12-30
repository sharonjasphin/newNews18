package com.news18.ampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of 
 * Lokmat Amp URL by Navigating and getting Amp Url from 
 * view page Source Code page and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPLokmatValidationsTest extends  DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 *  This method is used to navigate to News18 Home Page for 
	 *  Lokmat Language URL which is fetching from Property File
	 *  URL-https://lokmat.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToLokmatHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 
	 * Lokmat Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
//	@Test
//	public void lokmatHomePage() {
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}

	/**
	 * @author SanjeebKumarPati
	 *  This method is used to validate First Article AMP urls on 
	 *  News18 Lokmat Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopLokmatLandingPage.clickOnFirstArticleHomePage();// click on First Article Of lokmat Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on 
	 * News18 Lokmat sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopLokmatLandingPage.clickOnSportsLnk();//click on sports link present on header part of home page
		pages.desktopLokmatSportsPage.clickOnFirstArticleSportsPage();// click on First Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on 
	 *News18 Lokmat Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopLokmatLandingPage.clickOnFirstSectionLnk();//click on entertainment link present on header part of home page
		pages.desktopLokmatSectionPage.clickOnFirstArticleSectionPage();// click on First Article Of entertainment Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on 
	 * News18 Lokmat Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/   
	 */
	@Test
	public void firstArticlePhotoGalleryAMPValidation() {
		pages.desktopLokmatLandingPage.clickOnPhotosSection();//click on photo section link present on header part of home page
		pages.desktopLokmatPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();// click on First Article Of phot gallery consumption Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on 
	 * News18 Lokmat Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopLokmatLandingPage.navigateToVideosSection();//click on video section link present on header part of home page
		pages.desktopLokmatVideosPage.clickOnFirstVideoArticle();// click on First Article Of video Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Lokmat Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopLokmatLandingPage.clickOnLiveBlogArticleHomePage();// click on First live blog Article Of home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Lokmat Sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/   
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.desktopLokmatLandingPage.clickOnSportsLnk();//click on sports link present on header part of home page
		pages.desktopLokmatSportsPage.clickOnFirstLiveBlogArticleSportsPage();// click on First live blog Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Trending Topics Article 
	 * AMP url on News18 Lokmat Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopLokmatLandingPage.clickOnFirstTopicLnkTrendingTopics();// click on First Article Of trending topics of home Page
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}
}
