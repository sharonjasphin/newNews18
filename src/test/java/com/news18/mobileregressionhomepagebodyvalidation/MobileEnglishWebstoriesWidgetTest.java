package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image , See More Link Navigation and Slider Navigation
 * for WebStories Widget
 */
public class MobileEnglishWebstoriesWidgetTest extends MobileCommonConfig  {

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
	 * This method is used to Verify the Webstories Section Article Text Navigation in Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.mobileLandingPage.verifyWebstoriesArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Webstories Section Image Navigation in Homepage
	 */
	@Test
	public void webstoriesImageNavigation()
	{
		pages.mobileLandingPage.verifyWebstoriesImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Slider Navigation For Webstories Section in Homepage
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.mobileLandingPage.verifyWebStoriesSlideNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the See More Link Navigation for Webstories Section in Homepage
	 */
	@Test
	public void webstoriesSeeMoreLinkValidation()
	{
		pages.mobileLandingPage.verifyWebstoriesSeeMoreLinkNavigation(this.serverType);
	}
}