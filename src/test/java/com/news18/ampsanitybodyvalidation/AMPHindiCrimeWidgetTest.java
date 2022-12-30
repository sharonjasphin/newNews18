package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiCrimeWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampHindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget Article
	 */
	@Test
	public void verifyHindiHomePageCrimeWidgetArticle() {
		pages.ampHindiSanityLandingPage.verifyCrimeWidgetArticle(serverType);        
	}

}
