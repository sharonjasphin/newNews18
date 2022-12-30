package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More World News Link Navigation 
 * for World Widget
 */
public class AMPEnglishWorldWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify the World Section Article Text Navigation in Homepage
	 */
	@Test
	public void worldArticleNavigation()
	{
		pages.ampSanityLandingPage.verifyWorldArticleNavigation(serverType);
	}

}
