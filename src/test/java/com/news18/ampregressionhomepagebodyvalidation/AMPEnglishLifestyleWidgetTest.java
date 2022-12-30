package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Lifestyle News Link Navigation 
 * for Lifestyle Widget
 */
public class AMPEnglishLifestyleWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify the Lifestyle Section Article Text Navigation in Homepage
	 */
	@Test
	public void lifestyleArticleNavigation()
	{
		pages.ampLandingPage.verifyLifestyleArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Lifestyle Section Image Navigation in Homepage
	 */
	@Test
	public void lifestyleImageNavigation()
	{
		pages.ampLandingPage.verifyLifestyleImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Lifestyle News Link for Lifestyle Section in Homepage
	 */
	@Test
	public void moreLifestyleNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreLifestyleNewsNavigation(this.serverType);
	}
}
