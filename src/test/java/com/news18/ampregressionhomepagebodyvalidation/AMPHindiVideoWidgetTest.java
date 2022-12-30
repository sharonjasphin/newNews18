package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiVideoWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinAmpBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Image
	 */
	@Test
	public void verifyHindiHomePageVideoWidgetImg() {
		pages.ampHindiLandingPage.verifyVideoWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageVideoWidgetArticle() {
		pages.ampHindiLandingPage.verifyVideoWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget 
	 */
	@Test
	public void verifyHindiHomePageVideoWidget() {
		pages.ampHindiLandingPage.verifyVideoWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Video News
	 */
	@Test
	public void verifyHindiHomePageVideoWidgetMoreLnk() {
		pages.ampHindiLandingPage.verifyMoreVideoLnk(this.serverType);        
	}
	
	
}
