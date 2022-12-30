package com.news18.desktopsanitybodyvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiDharmWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Dharm Widget Article
	 */
	@Test
	public void verifyHindiHomePageDharmWidgetArticle() {
		pages.desktopHindiSanityLandingPage.verifyDharmWidgetArticle(serverType);        
	}

	

}
