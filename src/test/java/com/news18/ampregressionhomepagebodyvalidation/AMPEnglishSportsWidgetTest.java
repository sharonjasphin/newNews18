package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Sports News Link Navigation 
 * for Sports Widget
 */
public class AMPEnglishSportsWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/amp
	 */
	//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Sports Section Article Text Navigation in Homepage
	 */
	@Test
	public void sportsArticleNavigation()
	{
		pages.ampLandingPage.verifySportsArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Sports Section Image Navigation in Homepage
	 */
	@Test
	public void sportsImageNavigation()
	{
		pages.ampLandingPage.verifySportsImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Sports News Link Navigation for Sports Section in Homepage
	 */
	@Test
	public void moreSportsNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreSportsNewsNavigation(this.serverType);
	}
}
