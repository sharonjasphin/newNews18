package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiEntertainmentWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of Entertainment Widget Image
	 */
	@Test
	public void verifyGujaratiEntertainmentWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyEntertainmentWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiEntertainmentWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyEntertainmentWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Entertainment News
	 */
	@Test
	public void verifyGujaratiEntertainmentWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreEntertainmentLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget
	 */
	@Test
	public void verifyGujaratiEntertainmentWidget() {
		pages.mobileGujaratiLandingPage.verifyEntertainmentWidget(this.serverType);        
	}

}
