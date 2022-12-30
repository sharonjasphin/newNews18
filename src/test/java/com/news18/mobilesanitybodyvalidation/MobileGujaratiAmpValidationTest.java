package com.news18.mobilesanitybodyvalidation;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author 
 * This Test Class contains scripts for Verification of Gujarati Amp URL
 * by Navigating and getting Amp Url from view page Source Code page
 * and Taking The Help Of Amp Validator.
 * URL- https://validator.ampproject.org/  
 */
public class MobileGujaratiAmpValidationTest extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to validate priority Panel Articles
	 * Gujarati Home Page by taking The Help Of Amp Validator 
	 */
	@Test
	public void priorityPanelArticlesAMPValidation() {
		ArrayList<String> list = new ArrayList<>();
		list = pages.mobileGujaratiSanityLandingPage.priorityPanelArticles(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}


	/**
	 * @author DanishR
	 * This method is used to validate First Article AMP url on News18 
	 * Gujarati cricketNext Page by taking The Help Of Amp Validator
	 */
	@Test
	public void firstArticleCricketNextAMPValidation() {
		ArrayList<String> list = new ArrayList<>();
		list =pages.mobileGujaratiSanityLandingPage.verifyCricketNextArticleLnk(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}


	/**
	 * @author DanishR
	 * This method is used to validate Live Blog AMP url on News18 
	 * Gujarati Homepage by taking The Help Of Amp Validator
	 */
	@Test
	public void homePageLiveBlogAMPValidationHomePage() {
		ArrayList<String> list = new ArrayList<>();
		list = pages.mobileGujaratiSanityLandingPage.homePageLiveBlogArticle(serverType);
		pages.ampValidatorPage.verifyUIAMPValidationStatus(list,serverType);//Validates Amp Url is Pass or Fail
	}

}
