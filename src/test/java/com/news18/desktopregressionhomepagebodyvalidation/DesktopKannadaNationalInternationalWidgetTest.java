package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaNationalInternationalWidgetTest extends DesktopCommonConfig {


	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Kannada Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget Image
	 */
	@Test
	public void verifyKannadaNationalInternationalWidgetImg() {
		pages.desktopKannadaLandingPage.verifyNationalInternationalWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaNationalInternationalWidgetArticle() {
		pages.desktopKannadaLandingPage.verifyNationalInternationalWidgetArticle(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More NationalInternational News
	 */
	@Test
	public void verifyKannadaNationalInternationalWidgetMoreLnk() {
		pages.desktopKannadaLandingPage.verifyMoreNationalInternationalLnk(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget
	 */
	@Test
	public void verifyKannadaNationalInternationalWidget() {
		pages.desktopKannadaLandingPage.verifyNationalInternationalWidget(this.serverType);        
	}

}
