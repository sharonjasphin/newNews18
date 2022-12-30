package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiEntertainmentWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of Entertainment Widget Image
	 */
	@Test
	public void verifyGujaratiEntertainmentWidgetImg() {
		pages.desktopGujaratiLandingPage.verifyEntertainmentWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiEntertainmentWidgetArticle() {
		pages.desktopGujaratiLandingPage.verifyEntertainmentWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Entertainment News
	 */
	@Test
	public void verifyGujaratiEntertainmentWidgetMoreLnk() {
		pages.desktopGujaratiLandingPage.verifyMoreEntertainmentLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget
	 */
	@Test
	public void verifyGujaratiEntertainmentWidget() {
		pages.desktopGujaratiLandingPage.verifyEntertainmentWidget(this.serverType);        
	}

}
