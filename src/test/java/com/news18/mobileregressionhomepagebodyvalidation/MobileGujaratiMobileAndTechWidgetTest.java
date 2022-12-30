package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiMobileAndTechWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Image
	 */
	@Test
	public void verifyGujaratiMobileAndTechWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyMobileAndTechWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiMobileAndTechWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyMobileAndTechWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of MobileAndTech Widget 
	 */
	@Test
	public void verifyGujaratiMobileAndTechWidget() {
		pages.mobileGujaratiLandingPage.verifyMobileAndTechWidget(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More MobileAndTech News
	 */
	@Test
	public void verifyGujaratiMobileAndTechWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreMobileAndTechLnk(this.serverType);        
	}
	
	
}
