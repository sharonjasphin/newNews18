package com.news18.ampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of English Amp URL
 * by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AMPEnglishValidationTest extends DesktopCommonConfig{

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for English
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToEnglishHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
//	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate AMP urls on News18 English Home
	 * Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void englishHomePage() {
		String url = getCurrentPageUrl();
		pages.ampValidatorPage.verifyAMPValidationStatus(url);//Verify Amp Url present or not
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP urls on News18
	 * English Home Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of English Home Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * English cricketNext Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleCricketNextAMPValidation() {
		pages.desktopLandingPage.clickOnCricketNextLnk();//It will click on Cricketnext link present on the hamburger Menu.
		pages.ampCricketNextPage.clickOnFirstArticleCricketNextPage();//It will click on First Article Of English CricketNext Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * English India Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.ampSectionPage.clickOnFirstArticleSectionPage();//It will click on First Article Of English india Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Article AMP url on News18 
	 * English Photo Gallery Consumption Page by taking The Help Of Amp Validator 
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticlePhotoGalleryAMPValidation() {
		pages.desktopLandingPage.clickOnPhotosSection();//It will Click On Photo Section present on Line One Section
		pages.desktopphotoGalleryConsumptionPage.navigateToOldPhotogalleryFirstArticle();//It will click on First photo Article Of English photo gallery consumption Page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}
	

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Video Article AMP url on News18 
	 * English Videos Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopLandingPage.navigateToFirstVideosArticle();//It will navigate to  first video article
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * English Homepage by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Live Blog AMP url on News18 
	 * English CricketNext Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void liveBlogAMPValidationCricketNextPage() {
		pages.desktopLandingPage.clickOnCricketNextLnk();
		pages.ampCricketNextPage.clickOnLiveBlogArticleCricketNextPage();//It will navigate to  first live blog  article of cricket next page
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate First Trending Topics Article AMP url on News18 English Home Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void firstArticleAMPValidationTrendingTopics() {
		pages.desktopLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will navigate to  first trending topics article
		pages.ampValidatorPage.verifyAMPValidationStatus(getCurrentPageUrl());//Verify Amp Url present or not 
	}
}
