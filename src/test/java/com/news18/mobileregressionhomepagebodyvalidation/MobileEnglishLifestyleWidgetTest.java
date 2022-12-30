package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Lifestyle News Link Navigation 
 * for Lifestyle Widget
 */
public class MobileEnglishLifestyleWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Lifestyle Section Article Text Navigation in Homepage
	 */
	@Test
	public void lifestyleArticleNavigation()
	{
		pages.mobileLandingPage.verifyLifestyleArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Lifestyle Section Image Navigation in Homepage
	 */
	@Test
	public void lifestyleImageNavigation()
	{
		pages.mobileLandingPage.verifyLifestyleImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Lifestyle News Link for Lifestyle Section in Homepage
	 */
	@Test
	public void moreLifestyleNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreLifestyleNewsNavigation(this.serverType);
	}
}
