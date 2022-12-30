package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Opinion News Link Navigation 
 * for Opinion Widget
 */
public class MobileEnglishOpinionWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify the Opinion Section Article Text Navigation in Homepage
	 */
	@Test
	public void opinionArticleNavigation()
	{
		pages.mobileLandingPage.verifyOpinionArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Opinion Section Image Navigation in Homepage
	 */
	@Test
	public void opinionImageNavigation()
	{
		pages.mobileLandingPage.verifyOpinionImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Opinion News Link Navigation for Opinion Section in Homepage
	 */
	@Test
	public void moreOpinionNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreOpinionNewsNavigation(this.serverType);
	}
}
