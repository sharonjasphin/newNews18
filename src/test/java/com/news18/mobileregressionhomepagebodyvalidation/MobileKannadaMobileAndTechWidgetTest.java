package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileKannadaMobileAndTechWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of MobileAndTech Widget Image
	 */
	@Test
	public void verifyKannadaMobileAndTechWidgetImg() {
		pages.mobileKannadaLandingPage.verifyMobileAndTechWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaMobileAndTechWidgetArticle() {
		pages.mobileKannadaLandingPage.verifyMobileAndTechWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget 
	 */
	@Test
	public void verifyKannadaMobileAndTechWidget() {
		pages.mobileKannadaLandingPage.verifyMobileAndTechWidget(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More MobileAndTech News
	 */
	@Test
	public void verifyKannadaMobileAndTechWidgetMoreLnk() {
		pages.mobileKannadaLandingPage.verifyMoreMobileAndTechLnk(this.serverType);        
	}
	
	
}
