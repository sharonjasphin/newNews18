package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiNationWidgetTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
	//@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Image
	 */
	@Test
	public void verifyHindiHomePageNationWidgetImg() {
		pages.desktopHindiLandingPage.verifyNationWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageNationWidgetArticle() {
		pages.desktopHindiLandingPage.verifyNationWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	@Test
	public void verifyHindiHomePageNationWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreNationLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget
	 */
	@Test
	public void verifyHindiHomePageNationWidget() {
		pages.desktopHindiLandingPage.verifyNationWidget(this.serverType);        
	}
	
}
