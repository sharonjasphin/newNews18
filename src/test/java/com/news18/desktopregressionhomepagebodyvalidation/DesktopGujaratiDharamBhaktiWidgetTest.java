package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class Contains Test Files for Gujarati Language DharamBhakti Section Article and Image Navigation
 */
public class DesktopGujaratiDharamBhaktiWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the DharamBhakti Article Navigation In Gujarati Homepage
	 */
	@Test
	public void dharamBhaktiArticleNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyDharamBhaktiArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the DharamBhakti Image Article Navigation In Gujarati Homepage
	 */
	@Test
	public void dharamBhaktiImageNavigation()
	{
		pages.desktopGujaratiLandingPage.verifyDharamBhaktiImageNavigation(serverType);
	}
}
