package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Health and Fitness News Link Navigation 
 * for Health and Fitness Widget
 */
public class AMPEnglishHealthAndFitnessWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify The Health and Fitness Image Navigation in Homepage
	 */
	@Test
	public void healthAndFitnessImageNavigation()
	{
		pages.ampLandingPage.verifyHealthAndFitnessImageNavigation(serverType);	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate Health and Fitness Section Article Text Navigation in Homepage 
	 */
	@Test
	public void healthAndFitnessArticleNavigation()
	{
		pages.ampLandingPage.verifyHealthAndFitnessArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Health and Fitness News Navigation Link in Homepage 
	 */
	@Test
	public void moreHealthAndFitnessrNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreHealthAndFitnessNewsNavigation(serverType);
	}
}
