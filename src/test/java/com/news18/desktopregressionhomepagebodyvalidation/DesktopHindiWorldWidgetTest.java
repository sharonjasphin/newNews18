package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiWorldWidgetTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Image
	 */
	@Test
	public void verifyHindiHomePageWorldWidgetImg() {
		pages.desktopHindiLandingPage.verifyWorldWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageWorldWidgetArticle() {
		pages.desktopHindiLandingPage.verifyWorldWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	@Test
	public void verifyHindiHomePageWorldWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreWorldLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	@Test
	public void verifyHindiHomePageWorldWidget() {
		pages.desktopHindiLandingPage.verifyWorldWidget(this.serverType);        
	}
}
