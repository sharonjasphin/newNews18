package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiMobileAndTechWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Image
	 */
	@Test
	public void verifyGujaratiMobileAndTechWidgetImg() {
		pages.desktopGujaratiLandingPage.verifyMobileAndTechWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiMobileAndTechWidgetArticle() {
		pages.desktopGujaratiLandingPage.verifyMobileAndTechWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget 
	 */
	@Test
	public void verifyGujaratiMobileAndTechWidget() {
		pages.desktopGujaratiLandingPage.verifyMobileAndTechWidget(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More MobileAndTech News
	 */
	@Test
	public void verifyGujaratiMobileAndTechWidgetMoreLnk() {
		pages.desktopGujaratiLandingPage.verifyMoreMobileAndTechLnk(this.serverType);        
	}
	
	
}
