package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Explainers News Link Navigation 
 * for Explainers Widget
 */
public class AMPEnglishExplainersWidgetTest extends MobileCommonConfig {


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
	 * This method is used to Validate Explainers Section Article Text Navigation in Homepage 
	 */
	@Test
	public void explainersArticleNavigation()
	{
		pages.ampSanityLandingPage.verifyExplainersArticleNavigation(serverType);
	}
}
