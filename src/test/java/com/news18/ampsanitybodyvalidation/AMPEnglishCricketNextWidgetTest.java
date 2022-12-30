package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate the Cricketnext Article , Image and Cricketnext Tabs Link Validation in Homepage
 */
public class AMPEnglishCricketNextWidgetTest extends MobileCommonConfig{
	
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("engAmpBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext Widget Article Text Navigation
	 */
	@Test
	public void cricketNextArticleNavigation()
	{
		pages.ampSanityLandingPage.verifyCricketNextArticleNavigation(serverType);
	}
}
