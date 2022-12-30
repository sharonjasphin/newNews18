package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatSuperHitBoxWidgetTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Lokmat Home page URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of SuperHitBox Widget Article
	 */
	@Test
	public void verifyLokmatSuperHitBoxWidgetArticle() {
		pages.desktopLokmatLandingPage.verifySuperHitBoxWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of SuperHitBox Widget Image
	 */
	@Test
	public void verifyLokmatSuperHitBoxWidgetImg() {
		pages.desktopLokmatLandingPage.verifySuperHitBoxWidgetImg(this.serverType);        
	}
	
}
