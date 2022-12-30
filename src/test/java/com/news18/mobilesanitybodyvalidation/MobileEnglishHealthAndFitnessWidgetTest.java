package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Health and Fitness News Link Navigation 
 * for Health And Fitness to Widget
 */
public class MobileEnglishHealthAndFitnessWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify the Health and Fitness Section Article Text Navigation in Homepage
	 */
	@Test
	public void healthAndFitnessArticleNavigation()
	{
		pages.mobileSanityLandingPage.verifyHealthAndFitnessArticleNavigation(serverType);
	}
	
}
