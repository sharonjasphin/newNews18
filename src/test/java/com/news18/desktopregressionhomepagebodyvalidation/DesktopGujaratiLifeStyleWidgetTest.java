package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiLifeStyleWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	@Test
	public void verifyGujaratiHomePageLifeStyleWidgetImg() {
		pages.desktopGujaratiLandingPage.verifyLifeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test(priority = 4)
	public void verifyGujaratiHomePageLifeStyleWidgetArticle() {
		pages.desktopGujaratiLandingPage.verifyLifeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	@Test
	public void verifyGujaratiHomePageLifeStyleWidgetMoreLnk() {
		pages.desktopGujaratiLandingPage.verifyMoreLifeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	@Test
	public void verifyGujaratiHomePageLifeStyleWidget() {
		pages.desktopGujaratiLandingPage.verifyLifeWidget(this.serverType);        
	}
}
