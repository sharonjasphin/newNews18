package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Football News Link Navigation 
 * for Football Widget
 */
public class MobileEnglishFootballWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Football Section Article Text Navigation in Homepage
	 */
	@Test
	public void footballArticleNavigation()
	{
		pages.mobileLandingPage.verifyFootballArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Football Section Image Navigation in Homepage
	 */
	@Test
	public void footballImageNavigation()
	{
		pages.mobileLandingPage.verifyFootballImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Football News Navigation for Football Section in Homepage
	 */
	@Test
	public void moreFootballNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreFootballNewsNavigation(this.serverType);
	}
}
