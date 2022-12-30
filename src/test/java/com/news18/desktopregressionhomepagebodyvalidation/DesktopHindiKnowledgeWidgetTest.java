package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiKnowledgeWidgetTest extends DesktopCommonConfig{

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
		pages.desktopHindiLandingPage.verifyKnowledgeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageKnowledgeWidgetArticle() {
		pages.desktopHindiLandingPage.verifyKnowledgeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	@Test
	public void verifyHindiHomePageKnowledgeWidgetMoreLnk() {
		pages.desktopHindiLandingPage.verifyMoreKnowledgeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	@Test
	public void verifyHindiHomePageKnowledgeWidget() {
		pages.desktopHindiLandingPage.verifyKnowledgeWidget(this.serverType);        
	}

}
