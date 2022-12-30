package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiWorldWidgetTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	@Test
	public void verifyHindiHomePageWorldWidgetImg() {
		pages.mobileHindiLandingPage.verifyWorldWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageWorldWidgetArticle() {
		pages.mobileHindiLandingPage.verifyWorldWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	@Test
	public void verifyHindiHomePageWorldWidgetMoreLnk() {
		pages.mobileHindiLandingPage.verifyMoreWorldLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	@Test
	public void verifyHindiHomePageWorldWidget() {
		pages.mobileHindiLandingPage.verifyWorldWidget(this.serverType);        
	}
}
