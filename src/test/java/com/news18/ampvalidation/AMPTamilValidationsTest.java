package com.news18.ampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 * This Test Class contains scripts for Verification of Tamil Amp URL 
 * by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPTamilValidationsTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for 
	 * Tamil Language URL which is fetching from Property File
	 *  URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToTamilHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
//	}



	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 
	 * Tamil Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
//	@Test
//	public void tamilHomePage() {
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on 
	 * News18 Tamil Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopTamilLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of tamil Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *Tamil sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopTamilLandingPage.clickOnSportsLnk();
		pages.desktopTamilSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Tamil Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopTamilLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopTamilSectionPage.clickOnFirstArticlePage();//It will click on First Article Of cinema Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}



	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *Tamil Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.desktopTamilLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopTamilPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on News18 
	 * Tamil Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/   
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopTamilLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopTamilVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Tamil Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopTamilLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Tamil Sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationSportsPage() {
		pages.desktopTamilLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopTamilSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 *  This method is used to validate First Trending Topics Article 
	 *  AMP url on News18 Tamil Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopTamilLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}
}
