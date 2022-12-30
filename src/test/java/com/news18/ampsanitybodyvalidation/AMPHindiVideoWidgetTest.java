package com.news18.ampsanitybodyvalidation;

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
	 * This method is used to validate navigation of Video Widget Article
	 */
	@Test
	public void verifyHindiHomePageVideoWidgetArticle() {
		pages.ampHindiSanityLandingPage.verifyVideoWidgetArticle(this.serverType);        
	}

}
