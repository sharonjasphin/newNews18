package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test files to Validate Promoted Content Ads Article and Image Navigation in English Homepage
 */
public class DesktopHindiPromotedContentWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Article Navigation 
	 */
	@Test
	public void promotedContentArticleNavigation()
	{
		pages.desktopOutbrainValidation.verifyPromotedContentArticleNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Image Navigation
	 */
	@Test
	public void promotedContentImageNavigation()
	{
		pages.desktopOutbrainValidation.verifyPromotedContentImageNavigation();
	}
	
}
