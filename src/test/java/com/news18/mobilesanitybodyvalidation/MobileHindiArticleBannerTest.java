package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author 
 *
 */
public class MobileHindiArticleBannerTest extends MobileCommonConfig {

	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void articleBannerNavigation()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
		pages.mobileHindiSanityLandingPage.verifyArticleBannerNavigation("preProd");
	}
}
