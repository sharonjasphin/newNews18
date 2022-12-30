package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test files to Validate Promoted Content Ads Article and Image Navigation in English Homepage
 */
public class DesktopEnglishPromotedContentWidgetTest extends DesktopCommonConfig {

	
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("engBeta"));
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads Article Navigation in English Homepage
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
