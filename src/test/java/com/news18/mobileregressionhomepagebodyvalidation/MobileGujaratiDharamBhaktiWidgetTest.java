package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class Contains Test Files for Gujarati Language DharamBhakti Section Article and Image Navigation
 */
public class MobileGujaratiDharamBhaktiWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the DharamBhakti Article Navigation In Gujarati Homepage
	 */
	@Test
	public void dharamBhaktiArticleNavigation()
	{
		pages.mobileGujaratiLandingPage.verifyDharamBhaktiArticleNavigation("");
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the DharamBhakti Image Article Navigation In Gujarati Homepage
	 */
	@Test
	public void dharamBhaktiImageNavigation()
	{
		pages.mobileGujaratiLandingPage.verifyDharamBhaktiImageNavigation("");
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method validates the DharamBhakti Read More News Navigation In Gujarati Homepage
	 */
	@Test
	public void dharamBhaktiReadMoreNavigation() {
		pages.mobileGujaratiLandingPage.verifyDharamBhaktiReadMoreNavigation("preProd");
	}
}
