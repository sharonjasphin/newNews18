package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiNews18MinisWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinAmpBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisWorldOfNewsNavigation()
	{
		pages.ampHindiLandingPage.verifyNews18MinisWorldOfNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisImageNavigation()
	{
		pages.ampHindiLandingPage.verifyNews18MinisImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisArticleNavigation()
	{
		pages.ampHindiLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisReadMoreNavigation()
	{
		pages.ampHindiLandingPage.verifyNews18MinisReadMoreNavigation(serverType);
	}
}
