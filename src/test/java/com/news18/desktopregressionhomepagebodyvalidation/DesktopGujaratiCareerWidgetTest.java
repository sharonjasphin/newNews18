package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiCareerWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Career Widget Image
	 */
	@Test
	public void verifyGujaratiHomePageCareerWidgetImg() {
		pages.desktopGujaratiLandingPage.verifyCareerWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageCareerWidgetArticle() {
		pages.desktopGujaratiLandingPage.verifyCareerWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	@Test
	public void verifyGujaratiHomePageCareerWidgetMoreLnk() {
		pages.desktopGujaratiLandingPage.verifyMoreCareerLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	@Test
	public void verifyGujaratiHomePageCareerWidget() {
		pages.desktopGujaratiLandingPage.verifyCareerWidget(this.serverType);        
	}
}
