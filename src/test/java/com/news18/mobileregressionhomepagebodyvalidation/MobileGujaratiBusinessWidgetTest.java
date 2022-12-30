package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiBusinessWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Business Widget Image
	 */
	@Test
	public void verifyGujaratiHomePageBusinessWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyBusinessWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageBusinessWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyBusinessWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	@Test
	public void verifyGujaratiHomePageBusinessWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreBusinessLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	@Test
	public void verifyGujaratiHomePageBusinessWidget() {
		pages.mobileGujaratiLandingPage.verifyBusinessWidget(this.serverType);        
	}
}
