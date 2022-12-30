package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopKannadaPhotoWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Photo Widget Image
	 */
	@Test
	public void verifyKannadaHomePagePhotosWidgetImg() {
		pages.desktopKannadaLandingPage.verifyPhotosImgNavigation(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Photo Widget Article
	 */
	@Test(priority = 3)
	public void verifyKannadaHomePagePhotoWidgetArticle() {
		pages.desktopKannadaLandingPage.verifyPhotosArticlesNavigation(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Photo Widget
	 */
	@Test
	public void verifyKannadaHomePagePhotoWidget() {
		pages.desktopKannadaLandingPage.verifyPhotoWidget(this.serverType);        
	}
}
