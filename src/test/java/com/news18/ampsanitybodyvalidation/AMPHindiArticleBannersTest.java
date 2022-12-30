package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class AMPHindiArticleBannersTest extends MobileCommonConfig {
	
	/**
	 * @author VipinKumarGawande
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.hindi.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinAmpBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void articleBannerNavigation()
	{
		pages.ampHindiSanityLandingPage.verifyArticleBannerNavigation(serverType);
	}
}
