package com.news18.ampsanitybodyvalidation;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts for Verification of Hindi Amp URL
 * by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class AMPHindiValidationTest extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to validate AMP urls on News18 Hindi Home
	 * Page by taking The Help Of Amp Validator 
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	@Test
	public void hindiHomePage() {
		ArrayList<String> list = new ArrayList<>();
		list.add(getCurrentPageUrl());
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Verify Amp Url present or not
	}

	/**
	 * @author DanishR
	 * This method is used to validate priority Panel Articles
	 * Hindi Home Page by taking The Help Of Amp Validator 
	 */
	@Test
	public void priorityPanelArticlesAMPValidation() {
		ArrayList<String> list = new ArrayList<>();
		list = pages.ampHindiSanityLandingPage.priorityPanelArticles(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article AMP url on News18 
	 * Hindi cricketNext Page by taking The Help Of Amp Validator
	 */
	@Test
	public void firstArticleCricketNextAMPValidation() {
		ArrayList<String> list = new ArrayList<>();
		list =pages.ampHindiSanityLandingPage.verifyCricketNextArticleLnk(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}


	/**
	 * @author DanishR
	 * This method is used to validate Live Blog AMP url on News18 
	 * Hindi Homepage by taking The Help Of Amp Validator
	 */
	@Test
	public void homePageLiveBlogAMPValidationHomePage() {
		ArrayList<String> list = new ArrayList<>();
		list = pages.ampHindiSanityLandingPage.homePageLiveBlogArticle(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}

}
