package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiNationalInternationalWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of NationalInternational Widget Image
	 */
	@Test
	public void verifyGujaratiNationalInternationalWidgetImg() {
		pages.desktopGujaratiLandingPage.verifyNationalInternationalWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiNationalInternationalWidgetArticle() {
		pages.desktopGujaratiLandingPage.verifyNationalInternationalWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More NationalInternational News
	 */
	@Test
	public void verifyGujaratiNationalInternationalWidgetMoreLnk() {
		pages.desktopGujaratiLandingPage.verifyMoreNationalInternationalLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of NationalInternational Widget
	 */
	@Test
	public void verifyGujaratiNationalInternationalWidget() {
		pages.desktopGujaratiLandingPage.verifyNationalInternationalWidget(this.serverType);        
	}

}
