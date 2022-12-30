package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test files to Validate Promoted Content Ads Article and Image Navigation in Gujarati Homepage
 */
public class DesktopGujaratiPromotedContentWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Article Navigation
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Image Navigation
	 */
	@Test
	public void promotedContentArticleNavigation()
	{
		pages.desktopOutbrainValidation.verifyPromotedContentArticleNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Image Navigation in English Homepage
	 */
	@Test
	public void promotedContentImageNavigation()
	{
		pages.desktopOutbrainValidation.verifyPromotedContentImageNavigation();
	}
	
}
