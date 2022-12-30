package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileEnglishHotAndTrendingWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Validate the more Hot and Trending Link  and Verify the Article Text Navigation in Homepage 
	 */
	@Test
	public void moreHotAndTrendingArticleNavigation()
	{
		pages.mobileSanityLandingPage.verifyHotAndTrendingArticleNavigation(serverType);
	}
}