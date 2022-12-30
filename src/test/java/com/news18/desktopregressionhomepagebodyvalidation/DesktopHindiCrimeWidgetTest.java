package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiCrimeWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Crime Widget Image
	 */
	@Test
	public void verifyHindiHomePageCrimeWidgetImg() {
		pages.desktopHindiLandingPage.verifyCrimeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageCrimeWidgetArticle() {
		pages.desktopHindiLandingPage.verifyCrimeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Crime News
	 */
	@Test
	public void verifyHindiHomePageCrimeWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreCrimeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget
	 */
	@Test
	public void verifyHindiHomePageCrimeWidget() {
		pages.desktopHindiLandingPage.verifyCrimeWidget(this.serverType);        
	}
}
