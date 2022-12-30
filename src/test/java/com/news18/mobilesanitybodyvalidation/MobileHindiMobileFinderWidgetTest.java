package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiMobileFinderWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author 
	 */
//	@Test
	public void latestMobileNewsArticleNavigation()
	{
		pages.mobileHindiSanityLandingPage.verifyLatestMobileNewsArticleNavigation(serverType);
	}
	
//	@Test
	public void trendingAndRecommendedMobileStoriesNavigation()
	{
		pages.mobileHindiSanityLandingPage.verifyTrendingAndRecommendedStoriesNavigation(serverType);
	}
	
	@Test
	public void upcomingMobileStoriesNavigation()
	{
		pages.mobileHindiSanityLandingPage.verifyUpcomingMobileStoriesNavigation(serverType);
	}
	
}
