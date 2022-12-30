package com.news18.mobileregressionhomepagebodyvalidation;

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
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void latestMobileNewsArticleNavigation()
	{
		pages.mobileHindiLandingPage.verifyLatestMobileNewsArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void latestMobileNewsImageNavigation()
	{
		pages.mobileHindiLandingPage.verifyLatestMobileNewsImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void latestMobileNewsMoreNewsNavigation()
	{
		pages.mobileHindiLandingPage.verifyLatestMobileMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void mobileBrandsNavigation()
	{
		pages.mobileHindiLandingPage.verifyMobileBrandsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void trendingAndRecommendedMobileSliderNavigation()
	{
		pages.mobileHindiLandingPage.verifyTrendingAndRecommendedSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void trendingAndRecommendedMobileStoriesNavigation()
	{
		pages.mobileHindiLandingPage.verifyTrendingAndRecommendedStoriesNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void trendingAndRecommendedMobileReadMoreNavigation()
	{
		pages.mobileHindiLandingPage.verifyTrendingAndRecommendedMobileReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void upcomingMobileSliderNavigation()
	{
		pages.mobileHindiLandingPage.verifyUpcomingMobileSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void upcomingMobileStoriesNavigation()
	{
		pages.mobileHindiLandingPage.verifyUpcomingMobileStoriesNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void upcomingMobileReadMoreNavigation()
	{
		pages.mobileHindiLandingPage.verifyUpcomingMobileReadMoreNavigation(serverType);
	}
	
	
}
