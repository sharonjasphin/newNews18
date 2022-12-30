package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiCareerWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Career Widget Image
	 */
	@Test
	public void verifyHindiHomePageCareerWidgetImg() {
		pages.desktopHindiLandingPage.verifyCareerWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageCareerWidgetArticle() {
		pages.desktopHindiLandingPage.verifyCareerWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	@Test
	public void verifyHindiHomePageCareerWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreCareerLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	@Test
	public void verifyHindiHomePageCareerWidget() {
		pages.desktopHindiLandingPage.verifyCareerWidget(this.serverType);        
	}
}
