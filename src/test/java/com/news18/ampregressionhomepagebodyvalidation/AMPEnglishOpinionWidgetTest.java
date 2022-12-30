package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPEnglishOpinionWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify The Opinion Image Navigation in Homepage
	 */
	@Test
	public void opinionImageNavigation()
	{
		pages.ampLandingPage.verifyOpinionImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate Opinion Section Article Text Navigation in Homepage 
	 */
	@Test
	public void opinionArticleNavigation()
	{
		pages.ampLandingPage.verifyOpinionArticleNavigation(this.serverType);
	}
	
	@Test
	public void moreOpinionNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreOpinionNewsNavigation(this.serverType);
	}
}
