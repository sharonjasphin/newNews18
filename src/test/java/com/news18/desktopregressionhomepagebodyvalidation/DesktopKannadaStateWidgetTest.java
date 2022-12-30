package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaStateWidgetTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to kannada Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateTokannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of State Widget Image
	 */
	@Test
	public void verifyKannadaHomePageStateWidgetImg() {
		pages.desktopKannadaLandingPage.verifyStateWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of State Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaHomePageStateWidgetArticle() {
		pages.desktopKannadaLandingPage.verifyStateWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More State News
	 */
	@Test
	public void verifyKannadaHomePageStateWidgetMoreLnk() {
		pages.desktopKannadaLandingPage.verifyMoreStateLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of State Widget
	 */
	@Test
	public void verifyKannadaHomePageStateWidget() {
		pages.desktopKannadaLandingPage.verifyStateWidget(this.serverType);        
	}
}
