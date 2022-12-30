package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiBusinessWidgetTest extends DesktopCommonConfig {

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
		pages.desktopGujaratiLandingPage.verifyBusinessWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageBusinessWidgetArticle() {
		pages.desktopGujaratiLandingPage.verifyBusinessWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	@Test
	public void verifyGujaratiHomePageBusinessWidgetMoreLnk() {
		pages.desktopGujaratiLandingPage.verifyMoreBusinessLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	@Test
	public void verifyGujaratiHomePageBusinessWidget() {
		pages.desktopGujaratiLandingPage.verifyBusinessWidget(this.serverType);        
	}
}
