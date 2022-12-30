package com.news18.ampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of Kannada 
 * Amp URL by Navigating and getting Amp Url from view page Source 
 * Code page and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPKannadaValidationsTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for 
	 * Kannada Language URL which is fetching from Property File
	 *  URL-https://kannada.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToKanndaHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 
	 * Kannada Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
//	@Test
//	public void kannadaHomePage() {
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on 
	 * News18 Kannada Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopKannadaLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of kannada Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *Kannada sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopKannadaLandingPage.clickOnSportsLnk();
		pages.desktopKannadaSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Kannada Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopKannadaLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopKannadaSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of Section Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *Kannada Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.desktopKannadaLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on 
	 * News18 Kannada Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/   
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopKannadaLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopKannadaVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Kannada Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopKannadaLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Kannada Sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationSportsPage() {
		pages.desktopKannadaLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopKannadaSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Trending Topics Article 
	 * AMP url on News18 Kannada Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopKannadaLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}
}
