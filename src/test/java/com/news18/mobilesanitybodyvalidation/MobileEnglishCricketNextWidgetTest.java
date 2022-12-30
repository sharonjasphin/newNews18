package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image , Slider Navigation and Cricketnext Tabs Link Navigation 
 * for Cricketnext Widget
 */
public class MobileEnglishCricketNextWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify the Slider Navigation for Cricketnext Section in Homepage
	 */
//	@Test
	public void cricketNextSliderNavigation()
	{
		pages.mobileLandingPage.verifyCrickNextSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext Widget Article Text Navigation
	 */
	@Test
	public void cricketNextArticleNavigation()
	{
		pages.mobileSanityLandingPage.verifyCricketNextArticleNavigation(serverType);
	}
	
}
