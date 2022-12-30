package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatEntertainmentWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of Entertainment Widget Image
	 */
	@Test
	public void verifyLokmatEntertainmentWidgetImg() {
		pages.desktopLokmatLandingPage.verifyEntertainmentWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatEntertainmentWidgetArticle() {
		pages.desktopLokmatLandingPage.verifyEntertainmentWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Entertainment News
	 */
//	@Test
//	public void verifyLokmatEntertainmentWidgetMoreLnk() {
//		pages.desktopLokmatLandingPage.verifyMoreEntertainmentLnk(this.serverType);        
//	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget
	 */
	@Test
	public void verifyLokmatEntertainmentWidget() {
		pages.desktopLokmatLandingPage.verifyEntertainmentWidget(this.serverType);        
	}

}
