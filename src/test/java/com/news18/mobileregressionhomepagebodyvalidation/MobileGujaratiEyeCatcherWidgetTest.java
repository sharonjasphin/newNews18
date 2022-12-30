package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiEyeCatcherWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget Image
	 */
	@Test
	public void verifyGujaratiHomePageEyeCatcherWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyEyeCatcherWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageEyeCatcherWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyEyeCatcherWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More EyeCatcher News
	 */
	@Test
	public void verifyGujaratiHomePageEyeCatcherWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreEyeCatcherLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget
	 */
	@Test
	public void verifyGujaratiHomePageEyeCatcherWidget() {
		pages.mobileGujaratiLandingPage.verifyEyeCatcherWidget(this.serverType);        
	}

}
