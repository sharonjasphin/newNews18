package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatCareerWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Career Widget Image
	 */
	@Test
	public void verifyLokmatCareerWidgetImg() {
		pages.desktopLokmatLandingPage.verifyCareerWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatCareerWidgetArticle() {
		pages.desktopLokmatLandingPage.verifyCareerWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
//	@Test
//	public void verifyLokmatCareerWidgetMoreLnk() {
//		pages.desktopLokmatLandingPage.verifyMoreCareerLnk(this.serverType);        
//	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	@Test
	public void verifyLokmatCareerWidget() {
		pages.desktopLokmatLandingPage.verifyCareerWidget(this.serverType);        
	}
}
