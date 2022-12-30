package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiCareerWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget Image
	 */
	@Test
	public void verifyHindiHomePageCareerWidgetImg() {
		pages.mobileHindiLandingPage.verifyCareerWidgetImg(this.serverType);        
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiHomePageCareerWidgetArticle() {
		pages.mobileHindiLandingPage.verifyCareerWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of More Career News
	 */
	@Test
	public void verifyHindiHomePageCareerWidgetMoreLnk() {
		pages.mobileHindiLandingPage.verifyMoreCareerLnk(this.serverType);        
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget
	 */
	@Test
	public void verifyHindiHomePageCareerWidget() {
		pages.mobileHindiLandingPage.verifyCareerWidget(this.serverType);        
	}
}
