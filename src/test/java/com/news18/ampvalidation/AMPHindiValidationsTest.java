package com.news18.ampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of Hindi
 * Amp URL by Navigating and getting Amp Url from view page Source
 * Code page and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPHindiValidationsTest extends  DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for 
	 * Hindi Language URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToHindiHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 
	 * Hindi Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void hindiHomePage() {
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on 
	 * News18 Hindi Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopHindiLandingPage.clickOnFirstArticleHomePage();// click on First Article Of HIndi Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Hindi cricket Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleCricketNextAMPValidation() {
		pages.desktopHindiLandingPage.clickOnCricketNextLnk();//Click on cricketnext section of Home Page.
		pages.desktopHindiCricketNextPage.clickOnFirstArticleCricketNextPage();// click on First Article Of cricketnext  Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Hindi Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopHindiSectionPage.clickOnFirstArticleSectionPage();//click on First Article Of entertainment  Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * Hindi Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.desktopHindiLandingPage.clickOnPhotoSection();//Click on photo section of Home Page.
		pages.desktopHindiPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();//click on First Article Of photoArticle  Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on News18 
	 * Hindi Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopHindiLandingPage.navigateToVideosSection();//Click on video section of Home Page.
		pages.desktopHindiVideosPage.clickOnFirstVideoArticle();//click on First Article Of video  Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Hindi Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopHindiLandingPage.clickOnLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * Hindi Cricket Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.desktopHindiLandingPage.clickOnCricketNextLnk();//Click on cricketnext section of Home Page.
		pages.desktopHindiCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();//It will navigate to  first live blog article on cricketnext page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Trending Topics Article 
	 * AMP url on News18 Hindi Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/ 
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopHindiLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will navigate to  first  article on trending topics page
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}
}
