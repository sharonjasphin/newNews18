package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Auto News Link Navigation 
 * for Auto Widget
 */
public class AMPEnglishAutoWidgetTest extends MobileCommonConfig 
{

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
	 * This method is used to Verify the Auto Section Article Text Navigation in Homepage
	 */
	@Test
	public void autoArticleNavigation()
	{
		pages.ampLandingPage.verifyAutoArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Auto Section Image Navigation in Homepage
	 */
	@Test
	public void autoImageNavigation()
	{
		pages.ampLandingPage.verifyAutoImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Auto News Link Navigation for Auto Section Homepage
	 */
	@Test
	public void moreAutoNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreAutoNewsNavigation(this.serverType);
	}
}
