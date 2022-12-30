package com.news18.ampregressionhomepagebodyvalidation;

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
		pages.ampLandingPage.verifyCricketNextArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext Widget Image Navigation
	 */
	@Test
	public void cricketNextImageNavigation()
	{
		pages.ampLandingPage.verifyCricketNextImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext News18 Logo Navigation 
	 */
	@Test
	public void cricketNextNews18LogoNavigation()
	{
		pages.ampLandingPage.verifyCricketNextNews18LogoNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext Logo Navigation 
	 */
	@Test
	public void cricketNextLogoNavigation()
	{
		pages.ampLandingPage.verifyCricketNextNews18LogoNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The CricketNext More News Navigation 
	 */
	@Test
	public void cricketNextMoreNewsNavigation()
	{
		pages.ampLandingPage.verifyCricketNextMoreNewsNavigation(serverType);
	}
	
}
