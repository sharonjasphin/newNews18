package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiLifeWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	@Test
	public void verifyHindiHomePageLifeWidgetImg() {
		pages.ampHindiLandingPage.verifyLifeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageLifestyleWidgetArticle() {
		pages.ampHindiLandingPage.verifyLifeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget 
	 */
	@Test
	public void verifyHindiHomePageLifeWidget() {
		pages.ampHindiLandingPage.verifyLifeWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	@Test
	public void verifyHindiHomePageLifeWidgetMoreLnk() {
		pages.ampHindiLandingPage.verifyMoreLifeLnk(this.serverType);        
	}
	
}
