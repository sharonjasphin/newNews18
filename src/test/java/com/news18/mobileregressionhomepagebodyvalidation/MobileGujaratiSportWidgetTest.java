package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiSportWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	@Test
	public void verifyGujaratiHomePageSportWidgetImg() {
		pages.mobileGujaratiLandingPage.verifySportWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageSportWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifySportWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	@Test
	public void verifyGujaratiHomePageSportWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreSportLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	@Test
	public void verifyGujaratiHomePageSportWidget() {
		pages.mobileGujaratiLandingPage.verifySportWidget(this.serverType);        
	}

}
