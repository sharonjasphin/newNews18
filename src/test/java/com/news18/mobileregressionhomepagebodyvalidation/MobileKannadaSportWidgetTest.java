package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileKannadaSportWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	@Test
	public void verifyKannadaHomePageSportWidgetImg() {
		pages.mobileKannadaLandingPage.verifySportWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaHomePageSportWidgetArticle() {
		pages.mobileKannadaLandingPage.verifySportWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	@Test
	public void verifyKannadaHomePageSportWidgetMoreLnk() {
		pages.mobileKannadaLandingPage.verifyMoreSportLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	@Test
	public void verifyKannadaHomePageSportWidget() {
		pages.mobileKannadaLandingPage.verifySportWidget(this.serverType);        
	}

}
