package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiCrimeWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampHindiUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget Image
	 */
	@Test
	public void verifyHindiHomePageCrimeWidgetImg() {
		pages.ampHindiLandingPage.verifyCrimeWidgetImg(this.serverType);        
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageCrimeWidgetArticle() {
		pages.ampHindiLandingPage.verifyCrimeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of More Crime News
	 */
	@Test
	public void verifyHindiHomePageCrimeWidgetMoreLnk() {
		pages.ampHindiLandingPage.verifyMoreCrimeLnk(this.serverType);        
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget
	 */
	@Test
	public void verifyHindiHomePageCrimeWidget() {
		pages.ampHindiLandingPage.verifyCrimeWidget(this.serverType);        
	}
}
