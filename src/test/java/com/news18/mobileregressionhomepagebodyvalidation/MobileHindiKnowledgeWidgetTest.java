package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiKnowledgeWidgetTest extends MobileCommonConfig  {

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
	 * This method is used to validate navigation of Knowledge Widget Image
	 */
	@Test
	public void verifyHindiHomePageKnowledgeWidgetImg() {
		pages.mobileHindiLandingPage.verifyKnowledgeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageKnowledgeWidgetArticle() {
		pages.mobileHindiLandingPage.verifyKnowledgeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	@Test
	public void verifyHindiHomePageKnowledgeWidgetMoreLnk() {
		pages.mobileHindiLandingPage.verifyMoreKnowledgeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	@Test
	public void verifyHindiHomePageKnowledgeWidget() {
		pages.mobileHindiLandingPage.verifyKnowledgeWidget(this.serverType);        
	}
}
