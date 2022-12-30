package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Buzz News Link Navigation 
 * for Buzz Widget 
 */
public class AMPEnglishBuzzWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify The Buzz Image Navigation in Homepage
	 */
	@Test
	public void buzzImageNavigation()
	{
		pages.ampLandingPage.verifyBuzzImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate Buzz Section Article Text Navigation in Homepage 
	 */
	@Test
	public void buzzArticleNavigation()
	{
		pages.ampLandingPage.verifyBuzzArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Buzz News Navigation Link in Homepage 
	 */
	@Test
	public void moreBuzzNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreBuzzNewsNavigation(this.serverType);
	}
}
