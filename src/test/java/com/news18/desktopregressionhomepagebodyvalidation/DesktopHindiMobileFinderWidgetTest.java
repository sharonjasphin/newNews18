package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiMobileFinderWidgetTest extends DesktopCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}

	@Test
	public void latestMobileNewsArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyLatestMobileNewsArticleNavigation(serverType);
	}

	@Test
	public void latestMobileNewsImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyLatestMobileNewsImageNavigation(serverType);
	}

	@Test
	public void latestMobileNewsMoreNewsNavigation()
	{
		pages.desktopHindiLandingPage.verifyLatestMobileMoreNewsNavigation(serverType);
	}

	@Test
	public void mobileBrandsNavigation()
	{
		pages.desktopHindiLandingPage.verifyMobileBrandsNavigation(serverType);
	}

	@Test
	public void trendingAndRecommendedMobileSliderNavigation()
	{
		pages.desktopHindiLandingPage.verifyTrendingAndRecommendedSliderNavigation();
	}

	@Test
	public void trendingAndRecommendedMobileStoriesNavigation()
	{
		pages.desktopHindiLandingPage.verifyTrendingAndRecommendedStoriesNavigation(serverType);
	}

	@Test
	public void trendingAndRecommendedMobileReadMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyTrendingAndRecommendedMobileReadMoreNavigation(serverType);
	}

	@Test
	public void upcomingMobileSliderNavigation()
	{
		pages.desktopHindiLandingPage.verifyUpcomingMobileSliderNavigation();
	}

	@Test
	public void upcomingMobileStoriesNavigation()
	{
		pages.desktopHindiLandingPage.verifyUpcomingMobileStoriesNavigation(serverType);
	}

	@Test
	public void upcomingMobileReadMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyUpcomingMobileReadMoreNavigation(serverType);
	}
}
