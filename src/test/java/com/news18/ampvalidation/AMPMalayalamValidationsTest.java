package com.news18.ampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 * This Test Class contains scripts for Verification of malayalam 
 * Amp URL by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPMalayalamValidationsTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for malayalam 
	 * Language URL which is fetching from Property File
	 *  URL-https://malayalam.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToMalayalamHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 malayalam Home 
	 * Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
//	@Test
//	public void malayalamHomePage() {
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on News18 
	 * malayalam Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopMalayalamLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of malayalam Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *malayalam sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopMalayalamLandingPage.clickOnSportsLnk();
		pages.desktopMalayalamSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * malayalam Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopMalayalamLandingPage.clickOnFirstSectionLnk();//click on india link present on line one of home page
		pages.desktopMalayalamSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of india Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *malayalam Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.desktopMalayalamLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on News18 
	 * malayalam Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/   
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopMalayalamLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopMalayalamVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * malayalam Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopMalayalamLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * malayalam Sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.desktopMalayalamLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopMalayalamSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 *  This method is used to validate First Trending Topics Article 
	 *  AMP url on News18 malayalam Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopMalayalamLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}
}
