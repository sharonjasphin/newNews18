package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image , See More Link Navigation and Slider Navigation
 * for WebStories Widget
 */
public class AMPEnglishWebstoriesWidgetTest extends MobileCommonConfig  {

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
	 * This method is used to Verify the Webstories Section Article Text Navigation in Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.ampLandingPage.verifyWebstoriesArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Webstories Section Image Navigation in Homepage
	 */
	@Test
	public void webstoriesImageNavigation()
	{
		pages.ampLandingPage.verifyWebstoriesImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Slider Navigation For Webstories Section in Homepage
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.ampLandingPage.verifyWebStoriesSlideNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the See More Link Navigation for Webstories Section in Homepage
	 */
	@Test
	public void webstoriesSeeMoreLinkValidation()
	{
		pages.ampLandingPage.verifyWebstoriesSeeMoreLinkNavigation(this.serverType);
	}
}