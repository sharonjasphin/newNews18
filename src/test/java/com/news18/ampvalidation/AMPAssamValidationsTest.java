package com.news18.ampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 * This Test Class contains scripts for Verification of assam Amp URL
 * by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/ 
 */
public class AMPAssamValidationsTest extends DesktopCommonConfig {


//	/**
//	 * @author SanjeebKumarPati
//	 * This method is used to navigate to News18 Home Page for assam
//	 * Language URL which is fetching from Property File
//	 *  URL-https://assam.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToassamHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 assam Home Page
	 * by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/  
	 */
//	@Test
//	public void assamHomePage() {
//		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp URL present or not 
//	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on News18 
	 * assam Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of assam Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 *This method is used to validate First Article AMP url on News18
	 *assam sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.desktopAssamLandingPage.clickOnSportsLnk();
		pages.desktopAssamSportsPage.clickOnFirstArticleSportsPage();//It will click on First Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp URL present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18
	 * assam Section Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.desktopAssamLandingPage.clickOnFirstSectionLnk();//click on Cinema link present on line one of home page
		pages.desktopAssamSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of cinema Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp URL present or not 
	}


	/**
	 *@author SanjeebKumarPati
	 *This method is used to validate First Article AMP url
	 *on News18 assam Photo Gallery Consumption Page by taking
	 *The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/ 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.desktopAssamLandingPage.clickOnPhotosSection();//click on photo section link present on line one of home page
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();//It will click on First Article Of photo gallery consumption Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp URL present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url
	 * on News18 assam Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/   
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopAssamLandingPage.clickOnVideoLnk();//click on video section link present on line one of home page
		pages.desktopAssamVideosPage.clickOnFirstArticleVideoPage();//It will click on First Article Of video Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp URL present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on
	 * News18 assam Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopAssamLandingPage.clickOnLiveBlogArticleHomePage();//It will click on First live blog Article Of home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp URL present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on
	 * News18 assam Sports Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/  
	 */
	@Test
	public void firstLiveBlogAMPValidationSportsPage() {
		pages.desktopAssamLandingPage.clickOnSportsLnk();//click on sports section link present on line one of home page
		pages.desktopAssamSportsPage.clickOnFirstLiveBlogArticleSportsPage();//It will click on First live blog Article Of sports Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp URL present or not 
	}
}
