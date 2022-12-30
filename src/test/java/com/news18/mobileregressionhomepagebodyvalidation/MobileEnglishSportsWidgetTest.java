package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Sports News Link Navigation 
 * for Sports Widget
 */
public class MobileEnglishSportsWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify the Sports Section Article Text Navigation in Homepage
	 */
	@Test
	public void sportsArticleNavigation()
	{
		pages.mobileLandingPage.verifySportsArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Sports Section Image Navigation in Homepage
	 */
	@Test
	public void sportsImageNavigation()
	{
		pages.mobileLandingPage.verifySportsImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Sports News Link Navigation for Sports Section in Homepage
	 */
	@Test
	public void moreSportsNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreSportsNewsNavigation(this.serverType);
	}
	
}
