package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaMobileAndTechWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Kannada Home page URL which is fetching from Property File
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
		pages.desktopKannadaLandingPage.verifyMobileAndTechWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaMobileAndTechWidgetArticle() {
		pages.desktopKannadaLandingPage.verifyMobileAndTechWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget 
	 */
	@Test
	public void verifyKannadaMobileAndTechWidget() {
		pages.desktopKannadaLandingPage.verifyMobileAndTechWidget(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More MobileAndTech News
	 */
	@Test
	public void verifyKannadaMobileAndTechWidgetMoreLnk() {
		pages.desktopKannadaLandingPage.verifyMoreMobileAndTechLnk(this.serverType);        
	}
	
	
}
