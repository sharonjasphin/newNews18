package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiVideoWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of Video Widget Image
	 */
	@Test
	public void verifyHindiHomePageVideoWidgetImg() {
		pages.desktopHindiLandingPage.verifyVideoWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageVideoWidgetArticle() {
		pages.desktopHindiLandingPage.verifyVideoWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget 
	 */
	@Test
	public void verifyHindiHomePageVideoWidget() {
		pages.desktopHindiLandingPage.verifyVideoWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Video News
	 */
	@Test
	public void verifyHindiHomePageWorldWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreVideoLnk(this.serverType);        
	}
	
}
