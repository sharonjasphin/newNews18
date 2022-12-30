package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatNationWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Nation Widget Image
	 */
	@Test
	public void verifyLokmatNationWidgetImg() {
		pages.desktopLokmatLandingPage.verifyNationWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatNationWidgetArticle() {
		pages.desktopLokmatLandingPage.verifyNationWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
//	@Test
//	public void verifyLokmatNationWidgetMoreLnk() {
//		pages.desktopLokmatLandingPage.verifyMoreNationLnk(this.serverType);        
//	}
//	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget
	 */
	@Test
	public void verifyLokmatNationWidget() {
		pages.desktopLokmatLandingPage.verifyNationWidget(this.serverType);        
	}
	
}
