package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiDharmWidgetTest extends MobileCommonConfig  {

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
	 * This method is used to validate navigation of Dharm Widget Image
	 */
	@Test
	public void verifyHindiHomePageDharmWidgetImg() {
		pages.ampHindiLandingPage.verifyDharmWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageDharmWidgetArticle() {
		pages.ampHindiLandingPage.verifyDharmWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget 
	 */
	@Test
	public void verifyHindiHomePageDharmWidget() {
		pages.ampHindiLandingPage.verifyDharmWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Dharm News
	 */
	@Test
	public void verifyHindiHomePageDharmWidgetMoreLnk() {
		pages.ampHindiLandingPage.verifyMoreDharmLnk(this.serverType);        
	}
}
