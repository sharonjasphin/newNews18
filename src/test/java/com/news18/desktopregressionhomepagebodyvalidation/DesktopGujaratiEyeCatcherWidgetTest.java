package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiEyeCatcherWidgetTest extends DesktopCommonConfig {

	
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
		pages.desktopGujaratiLandingPage.verifyEyeCatcherWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageEyeCatcherWidgetArticle() {
		pages.desktopGujaratiLandingPage.verifyEyeCatcherWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More EyeCatcher News
	 */
	@Test
	public void verifyGujaratiHomePageEyeCatcherWidgetMoreLnk() {
		pages.desktopGujaratiLandingPage.verifyMoreEyeCatcherLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of EyeCatcher Widget
	 */
	@Test
	public void verifyGujaratiHomePageEyeCatcherWidget() {
		pages.desktopGujaratiLandingPage.verifyEyeCatcherWidget(this.serverType);        
	}

}
