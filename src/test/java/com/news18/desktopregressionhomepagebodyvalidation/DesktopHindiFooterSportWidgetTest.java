package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiFooterSportWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	@Test
	public void verifyHindiHomePageFooterSportWidgetImg() {
		pages.desktopHindiLandingPage.verifyFooterSportWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageFooterSportWidgetArticle() {
		pages.desktopHindiLandingPage.verifyFooterSportWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	@Test
	public void verifyHindiHomePageFooterSportWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreFooterSportLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	@Test
	public void verifyHindiHomePageFooterSportWidget() {
		pages.desktopHindiLandingPage.verifyFooterSportWidget(this.serverType);        
	}

}
