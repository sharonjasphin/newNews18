package com.news18.ampsanitybodyvalidation;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.englishpages.AMPSanityLandingPage;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of English Amp URL
 * by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AMPEnglishValidationTest extends MobileCommonConfig{


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for English
	 * Language URL which is fetching from Property File
	 * URL-https://beta.news18.com/amp/
	 */
	//		@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate AMP urls on News18 English Home
	 * Page by taking The Help Of Amp Validator 
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void englishHomePage() {
		ArrayList<String> list = new ArrayList<>();
		list.add(getCurrentPageUrl());
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Verify Amp Url present or not
	}

	/**
	 * @author DanishR
	 * This method is used to validate priority Panel Articles
	 * English Home Page by taking The Help Of Amp Validator 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		ArrayList<String> list = new ArrayList<>();
		list = pages.ampSanityLandingPage.priorityPanelArticles(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article AMP url on News18 
	 * English cricketNext Page by taking The Help Of Amp Validator
	 */
		@Test
	public void firstArticleCricketNextAMPValidation() {
		ArrayList<String> list = new ArrayList<>();
		list =pages.ampSanityLandingPage.verifyCricketNextArticleLnk(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}


	/**
	 * @author DanishR
	 * This method is used to validate Live Blog AMP url on News18 
	 * English Homepage by taking The Help Of Amp Validator
	 */
		@Test
	public void homePageLiveBlogAMPValidationHomePage() {
		ArrayList<String> list = new ArrayList<>();
		list = pages.ampSanityLandingPage.homePageLiveBlogArticle(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}


	/**
	 * @author DanishR
	 * This method is used to validate Live Blog AMP url on News18 
	 * English CricketNext Page by taking The Help Of Amp Validator
	 * Url- https://validator.ampproject.org/
	 */
	@Test
	public void liveBlogAMPValidationCricketNextPage() {
		ArrayList<String> list = new ArrayList<>();
		list = pages.ampSanityLandingPage.verifyCricketNextLiveBlogArticle(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}

}
