package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiNationalInternationalWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of NationalInternational Widget Image
	 */
	@Test
	public void verifyGujaratiNationalInternationalWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyNationalInternationalWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiNationalInternationalWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyNationalInternationalWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More NationalInternational News
	 */
	@Test
	public void verifyGujaratiNationalInternationalWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreNationalInternationalLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget
	 */
	@Test
	public void verifyGujaratiNationalInternationalWidget() {
		pages.mobileGujaratiLandingPage.verifyNationalInternationalWidget(this.serverType);        
	}

}
