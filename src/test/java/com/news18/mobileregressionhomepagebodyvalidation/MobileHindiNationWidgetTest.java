package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiNationWidgetTest  extends MobileCommonConfig{

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
	 * This method is used to validate navigation of Nation Widget Image
	 */
	@Test
	public void verifyHindiHomePageNationWidgetImg() {
		pages.mobileHindiLandingPage.verifyNationWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageNationWidgetArticle() {
		pages.mobileHindiLandingPage.verifyNationWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget 
	 */
	@Test
	public void verifyHindiHomePageNationWidget() {
		pages.mobileHindiLandingPage.verifyNationWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	@Test
	public void verifyHindiHomePageNationWidgetMoreLnk() {
		pages.mobileHindiLandingPage.verifyMoreNationLnk(this.serverType);        
	}
}
