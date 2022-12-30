package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileGujaratiPhotosWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of Photos Widget Image
	 */
	@Test
	public void verifyGujaratiHomePagePhotosWidgetImg() {
		pages.mobileGujaratiLandingPage.verifyPhotosWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Photos Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePagePhotosWidgetArticle() {
		pages.mobileGujaratiLandingPage.verifyPhotosWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Photos Widget 
	 */
	@Test
	public void verifyGujaratiHomePagePhotosWidget() {
		pages.mobileGujaratiLandingPage.verifyPhotosWidget(this.serverType);        
	}
	
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Photos News
	 */
	@Test
	public void verifyGujaratiHomePagePhotosWidgetMoreLnk() {
		pages.mobileGujaratiLandingPage.verifyMorePhotosLnk(this.serverType);        
	}
	
	
}
