package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiVideoWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of Video Widget Image
	 */
	@Test
	public void verifyGujaratiHomePageVideoWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyVideoWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageVideoWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyVideoWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget 
	 */
	@Test
	public void verifyGujaratiHomePageVideoWidget() {
		pages.mobileGujaratiLandingPage.verifyVideoWidget(this.serverType);        
	}
	
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Video News
	 */
	@Test
	public void verifyGujaratiHomePageVideoWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMoreVideoLnk(this.serverType);        
	}
	
	
}
