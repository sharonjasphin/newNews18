package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Politics News Link Navigation 
 * for Politics Widget
 */
public class MobileEnglishPoliticsWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify the Politics Section Article Text Navigation in Homepage
	 */
	@Test
	public void politicsArticleNavigation()
	{
		pages.mobileLandingPage.verifyPoliticsArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Politics Section Image Navigation in Homepage
	 */
	@Test
	public void politicsImageNavigation()
	{
		pages.mobileLandingPage.verifyPoliticsImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Politics News Link Navigation for Politics Section in Homepage
	 */
	@Test
	public void morePoliticsNewsNavigation()
	{
		pages.mobileLandingPage.verifyMorePoliticsNewsNavigation(this.serverType);
	}
}
