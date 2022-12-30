package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiNews18MinisWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisWorldOfNewsNavigation()
	{
		pages.mobileHindiLandingPage.verifyNews18MinisWorldOfNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisImageNavigation()
	{
		pages.mobileHindiLandingPage.verifyNews18MinisImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisArticleNavigation()
	{
		pages.mobileHindiLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisReadMoreNavigation()
	{
		pages.mobileHindiLandingPage.verifyNews18MinisReadMoreNavigation(serverType);
	}
}
