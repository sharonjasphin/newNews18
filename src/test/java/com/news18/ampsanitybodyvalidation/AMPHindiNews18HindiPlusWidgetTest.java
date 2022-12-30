package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image , See More Link Navigation and Slider Navigation
 * for News 18 Hindi Plus Widget
 */
public class AMPHindiNews18HindiPlusWidgetTest extends MobileCommonConfig  {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://www.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampHindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the News 18 Hindi Plus Section Article Text Navigation in Homepage
	 */
	@Test
	public void news18HindiPlusArticleNavigation()
	{
		pages.ampHindiSanityLandingPage.verifyNews18PlusArticleNavigation(serverType);
	}

}