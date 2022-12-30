package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatSportWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	@Test
	public void verifyLokmatSportWidgetImg() {
		pages.desktopLokmatLandingPage.verifySportWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatSportWidgetArticle() {
		pages.desktopLokmatLandingPage.verifySportWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
//	@Test
//	public void verifyGujaratiHomePageSportWidgetMoreLnk() {
//		pages.desktopGujaratiLandingPage.verifyMoreSportLnk(this.serverType);        
//	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	@Test
	public void verifyLokmatSportWidget() {
		pages.desktopLokmatLandingPage.verifySportWidget(this.serverType);        
	}

}
