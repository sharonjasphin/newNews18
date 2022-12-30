package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Buzz News Link Navigation 
 * for Buzz Widget
 */
public class MobileEnglishBuzzWidgetTest extends MobileCommonConfig{

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
	 * This method is used to Verify the Buzz Section Article Text Navigation in Homepage
	 */
	@Test
	public void buzzArticleNavigation()
	{
		pages.mobileLandingPage.verifyBuzzArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Buzz Section Image Navigation in Homepage
	 */
	@Test
	public void buzzImageNavigation()
	{
		pages.mobileLandingPage.verifyBuzzImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Buzz News Link in Buzz Section in Homepage
	 */
	@Test
	public void moreBuzzNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreBuzzNewsNavigation(this.serverType);
	}
	
}
