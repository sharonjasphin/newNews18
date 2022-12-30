package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test files to Validate Promoted Content Ads Article and Image Navigation in Gujarati Homepage
 */
public class MobileGujaratiPromotedContentWidgetTest extends MobileCommonConfig {

	
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Article Navigation
	 */
	@Test
	public void promotedContentArticleNavigation()
	{
		pages.mobileOutbrainValidation.verifyPromotedContentArticleNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Image Navigation
	 */
	@Test
	public void promotedContentImageNavigation()
	{
		pages.mobileOutbrainValidation.verifyPromotedContentImageNavigation();
	}
	
}
