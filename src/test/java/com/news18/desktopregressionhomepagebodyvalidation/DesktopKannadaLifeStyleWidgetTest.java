package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaLifeStyleWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	@Test
	public void verifyKannadaHomePageLifeStyleWidgetImg() {
		pages.desktopKannadaLandingPage.verifyLifeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaHomePageLifeStyleWidgetArticle() {
		pages.desktopKannadaLandingPage.verifyLifeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	@Test
	public void verifyKannadaHomePageLifeStyleWidgetMoreLnk() {
		pages.desktopKannadaLandingPage.verifyMoreLifeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	@Test
	public void verifyKannadaHomePageLifeStyleWidget() {
		pages.desktopKannadaLandingPage.verifyLifeWidget(this.serverType);        
	}
}
