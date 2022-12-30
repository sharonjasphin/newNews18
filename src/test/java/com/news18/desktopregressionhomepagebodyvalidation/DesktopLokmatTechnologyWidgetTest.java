package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatTechnologyWidgetTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Lokmat Home page URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Image
	 */
	@Test
	public void verifyLokmatTechnologyWidgetImg() {
		pages.desktopLokmatLandingPage.verifyTechnologyWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatTechnologyWidgetArticle() {
		pages.desktopLokmatLandingPage.verifyTechnologyWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Technology News
	 */
//	@Test
//	public void verifyLokmatHomePageTechnologyWidgetMoreLnk() {
//		pages.desktopLokmatLandingPage.verifyMoreTechnologyLnk(this.serverType);        
//	}
//	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget
	 */
	@Test
	public void verifyLokmatTechnologyWidget() {
		pages.desktopLokmatLandingPage.verifyTechnologyWidget(this.serverType);        
	}
	
}
