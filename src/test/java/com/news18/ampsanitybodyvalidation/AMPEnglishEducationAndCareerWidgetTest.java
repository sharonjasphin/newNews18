package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Education and Career News Link Navigation 
 * for Education and Career Widget
 */
public class AMPEnglishEducationAndCareerWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Validate Education and Career Section Article Text Navigation in Homepage 
	 */
	@Test
	public void educationAndCareerArticleNavigation()
	{
		pages.ampSanityLandingPage.verifyEducationAndCareerArticleNavigation(serverType);
	}
}

