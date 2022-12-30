package com.news18.ampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 * This Test Class contains scripts for Verification of punjab 
 * Amp URL by Navigating and getting Amp Url from view page Source 
 * Code page and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPPunjabiValidationsTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for 
	 * punjab Language URL which is fetching from Property File
	 *  URL-https://punjab.news18.com/
	 */
//	@BeforeMethod
//	public void navigateTopunjabHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("punjabUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 
	 * punjab Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
//	@Test
//	public void punjabHomePage() {
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on 
	 * News18 punjab Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopPunjabLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of punjab Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *punjab sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopPunjabLandingPage.clickOnSportsLnk();
		pages.desktopPunjabSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * punjab Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopPunjabLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopPunjabSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18 
	 *punjab Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.desktopPunjabLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopPunjabPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on 
	 * News18 punjab Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/   
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopPunjabLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopPunjabVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * punjab Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopPunjabLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * punjab Sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.desktopPunjabLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopPunjabSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 *  This method is used to validate First Trending Topics Article 
	 *  AMP url on News18 punjab Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
//	@Test
//	public void firstArticleAMPValidationTrendingTopics() {
//		pages.desktopPunjabLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will click on First Article Of trending topics of home  Page
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
//	}
}
