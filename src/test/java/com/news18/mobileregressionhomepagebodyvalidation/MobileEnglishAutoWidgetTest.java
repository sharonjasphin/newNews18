package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Auto News Link Navigation 
 * for Auto Widget
 */
public class MobileEnglishAutoWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify the Auto Section Article Text Navigation in Homepage
	 */
	@Test
	public void autoArticleNavigation()
	{
		pages.mobileLandingPage.verifyAutoArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Auto Section Image Navigation in Homepage
	 */
	@Test
	public void autoImageNavigation()
	{
		pages.mobileLandingPage.verifyAutoImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Auto News Link Navigation for Auto Section Homepage
	 */
	@Test
	public void moreAutoNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreAutoNewsNavigation(serverType);
	}
}
