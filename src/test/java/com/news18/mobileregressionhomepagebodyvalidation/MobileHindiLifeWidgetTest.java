package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiLifeWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	@Test
	public void verifyHindiHomePageLifeWidgetImg() {
		pages.mobileHindiLandingPage.verifyLifeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageLifeWidgetArticle() {
		pages.mobileHindiLandingPage.verifyLifeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget 
	 */
	@Test
	public void verifyHindiHomePageLifeWidget() {
		pages.mobileHindiLandingPage.verifyLifeWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	@Test
	public void verifyHindiHomePageLifeWidgetMoreLnk() {
		pages.mobileHindiLandingPage.verifyMoreLifeLnk(this.serverType);        
	}
	
}
