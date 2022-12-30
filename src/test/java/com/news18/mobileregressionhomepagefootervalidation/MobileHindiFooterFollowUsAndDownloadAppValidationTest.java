package com.news18.mobileregressionhomepagefootervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Sections Present at Footer on Mobile English HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class MobileHindiFooterFollowUsAndDownloadAppValidationTest extends MobileCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
	//@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate the Social SHare Section Present at footer of Mobile Hindi Home Page.
	 */
	@Test
	public void footerFollowUsAndDownloadAppValidation () {
		pages.mobileLandingPage.verifySocialSites();
	}
}
