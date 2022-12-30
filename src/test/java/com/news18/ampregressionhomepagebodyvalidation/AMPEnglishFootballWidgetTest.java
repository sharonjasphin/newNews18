package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Football News Link Navigation 
 * for Football Widget
 */
public class AMPEnglishFootballWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Football Image Navigation in Homepage
	 */
	@Test
	public void footballImageNavigation()
	{
		pages.ampLandingPage.verifyFootballImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate Football Section Article Text Navigation in Homepage 
	 */
	@Test
	public void footballArticleNavigation()
	{
		pages.ampLandingPage.verifyFootballArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Opinion News Navigation Link in Homepage 
	 */
	@Test
	public void moreFootballNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreFootballNewsNavigation(this.serverType);
	}
}
