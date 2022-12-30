package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPEnglishPoliticsWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify The Politics Image Navigation in Homepage
	 */
	@Test
	public void politicsImageNavigation()
	{
		pages.ampLandingPage.verifyPoliticsImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate Politics Section Article Text Navigation in Homepage 
	 */
	@Test
	public void politicsArticleNavigation()
	{
		pages.ampLandingPage.verifyPoliticsArticleNavigation(this.serverType);
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Opinion News Navigation Link in Homepage 
	 */
	@Test
	public void morePoliticsNewsNavigation()
	{
		pages.ampLandingPage.verifyMorePoliticsNewsNavigation(this.serverType);
	}
}
