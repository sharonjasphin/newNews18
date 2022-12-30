package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.news18.init.MobileCommonConfig;

public class AMPEnglishVideosWidgetTest extends MobileCommonConfig{
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Videos Section Article Text Navigation in Homepage
	 */
	@Test
	public void videosArticleNavigation()
	{
		pages.ampSanityLandingPage.verifyVideosSectionArticleNavigation(serverType);
	}
}
