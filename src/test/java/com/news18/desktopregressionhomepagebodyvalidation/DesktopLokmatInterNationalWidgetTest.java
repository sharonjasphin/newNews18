package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatInterNationalWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of InterNational Widget Image
	 */
	@Test
	public void verifyLokmatInterNationalWidgetImg() {
		pages.desktopLokmatLandingPage.verifyInterNationalWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of InterNational Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatInterNationalWidgetArticle() {
		pages.desktopLokmatLandingPage.verifyInterNationalWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
//	@Test
//	public void verifyLokmatHomePageNationWidgetMoreLnk() {
//		pages.desktopLokmatLandingPage.verifyMoreNationLnk(this.serverType);        
//	}
//	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of InterNational Widget
	 */
	@Test
	public void verifyLokmatInterNationalWidget() {
		pages.desktopLokmatLandingPage.verifyInterNationalWidget(this.serverType);        
	}
	
}
