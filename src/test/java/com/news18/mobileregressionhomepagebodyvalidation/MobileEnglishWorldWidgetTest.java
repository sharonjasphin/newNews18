package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More World News Link Navigation 
 * for World Widget
 */
public class MobileEnglishWorldWidgetTest extends MobileCommonConfig {


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
	 * This method is used to Verify the World Section Article Text Navigation in Homepage
	 */
	@Test
	public void worldArticleNavigation()
	{
		pages.mobileLandingPage.verifyWorldArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the World Section Image Navigation in Homepage
	 */
	@Test
	public void worldImageNavigation()
	{
		pages.mobileLandingPage.verifyWorldImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More World News Link Navigation for World Section in Homepage
	 */
	@Test
	public void moreWorldNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreWorldNewsNavigation(this.serverType);
	}
}