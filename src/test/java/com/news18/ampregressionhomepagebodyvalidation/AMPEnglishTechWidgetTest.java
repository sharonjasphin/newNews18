package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPEnglishTechWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify The Tech Image Navigation in Homepage
	 */
	@Test
	public void techImageNavigation()
	{
		pages.ampLandingPage.verifyTechImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate Tech Section Article Text Navigation in Homepage 
	 */
	@Test
	public void techArticleNavigation()
	{
		pages.ampLandingPage.verifyTechArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Tech News Navigation Link in Homepage 
	 */
	@Test
	public void moreTechNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreTechNewsNavigation(this.serverType);
	}
}
