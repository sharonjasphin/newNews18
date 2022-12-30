package com.news18.ampsanitybodyvalidation;

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
	public void news18MinisArticleNavigation()
	{
		pages.ampHindiSanityLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
}
