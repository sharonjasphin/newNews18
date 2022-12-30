package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiCareerWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Career Widget Image
	 */
	@Test
	public void verifyGujaratiHomePageCareerWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyCareerWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageCareerWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyCareerWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	@Test
	public void verifyGujaratiHomePageCareerWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreCareerLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	@Test
	public void verifyGujaratiHomePageCareerWidget() {
		pages.mobileGujaratiLandingPage.verifyCareerWidget(this.serverType);        
	}
}
