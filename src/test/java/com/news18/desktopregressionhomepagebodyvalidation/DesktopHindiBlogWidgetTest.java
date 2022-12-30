package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiBlogWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Blog Widget Journalist Image
	 */
	@Test
	public void verifyHindiHomePageBlogWidgetJournalistImg() {
		pages.desktopHindiLandingPage.verifyBlogWidgetJournalistImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Article
	 */
	@Test
	public void verifyHindiHomePageBlogWidgetArticle() {
		pages.desktopHindiLandingPage.verifyBlogWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Blog News
	 */
	@Test
	public void verifyHindiHomePageBlogWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreBlogLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget
	 */
	@Test
	public void verifyHindiHomePageBlogWidget() {
		pages.desktopHindiLandingPage.verifyBlogWidget(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Journalist Profile Lnk
	 */
	@Test
	public void verifyHindiBlogWidgetJournalistProfileLnk() {
		pages.desktopHindiLandingPage.verifyBlogWidgetJournalistProfileLnk(this.serverType);        
	}
}
