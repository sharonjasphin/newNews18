package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatLifeStyleWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	@Test
	public void verifyLokmatLifeStyleWidgetImg() {
		pages.desktopLokmatLandingPage.verifyLifeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test(priority = 3)
	public void verifyLokmatLifeStyleWidgetArticle() {
		pages.desktopLokmatLandingPage.verifyLifeWidgetArticle(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	//	@Test
	//	public void verifyLokmatLifeStyleWidgetMoreLnk() {
	//		pages.desktopLokmatLandingPage.verifyMoreLifeLnk(this.serverType);        
	//	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	@Test
	public void verifyLokmatLifeStyleWidget() {
		pages.desktopLokmatLandingPage.verifyLifeWidget(this.serverType);        
	}
}
