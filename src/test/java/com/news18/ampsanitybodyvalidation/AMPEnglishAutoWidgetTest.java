package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Auto News Link Navigation 
 * for Auto Widget
 */
public class AMPEnglishAutoWidgetTest extends MobileCommonConfig 
{

	/**
	 * @author VipinKumarGawande
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Auto Section Article Text Navigation in Homepage
	 */
	@Test
	public void autoArticleNavigation()
	{
		pages.ampSanityLandingPage.verifyAutoArticleNavigation(serverType);
	}
}
