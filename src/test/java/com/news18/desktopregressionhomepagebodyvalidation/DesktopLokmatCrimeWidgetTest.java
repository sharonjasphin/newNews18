package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatCrimeWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Crime Widget Image
	 */
	@Test
	public void verifyLokmatCrimeWidgetImg() {
		pages.desktopLokmatLandingPage.verifyCrimeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatCrimeWidgetArticle() {
		pages.desktopLokmatLandingPage.verifyCrimeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Crime News
	 */
//	@Test
//	public void verifyLokmatCrimeWidgetMoreLnk() {
//		pages.desktopLokmatLandingPage.verifyMoreCrimeLnk("");        
//	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget
	 */
	@Test
	public void verifyLokmatCrimeWidget() {
		pages.desktopLokmatLandingPage.verifyCrimeWidget(this.serverType);        
	}
}
