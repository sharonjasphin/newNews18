package com.news18.mobileregressionhomepagebodyvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This Test class the contains the script to validate the Desktop Todays Panchang Section Read More Button is
 *clickable and navigated to their page
 */
public class MobileHindiTodaysPanchang extends MobileCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https:https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to verify the Todays panchang more Button present at the RHS of the Home page
	 */
	@Test
	public void todaysPanchang() {
		pages.mobileHindiLandingPage.verifyTodaysPanchang(serverType);	
	}
}
