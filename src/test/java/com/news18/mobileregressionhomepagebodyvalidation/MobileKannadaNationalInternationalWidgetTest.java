package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileKannadaNationalInternationalWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of NationalInternational Widget Image
	 */
	@Test
	public void verifyKannadaNationalInternationalWidgetImg() {
		pages.mobileKannadaLandingPage.verifyNationalInternationalWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaNationalInternationalWidgetArticle() {
		pages.mobileKannadaLandingPage.verifyNationalInternationalWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More NationalInternational News
	 */
	@Test
	public void verifyKannadaNationalInternationalWidgetMoreLnk() {
		pages.mobileKannadaLandingPage.verifyMoreNationalInternationalLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget
	 */
	@Test
	public void verifyKannadaNationalInternationalWidget() {
		pages.mobileKannadaLandingPage.verifyNationalInternationalWidget(this.serverType);        
	}

}
