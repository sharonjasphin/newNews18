package com.news18.ampregressionhomepagebodyvalidation;

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
	 * This method is used to Verify the Slider Navigation for Videos Section in Homepage
	 */
	@Test
	public void videoSliderNavigation() {
		pages.ampLandingPage.verifyVideosSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Videos News Link Validation for Videos Section in Homepage
	 */
	@Test
	public void moreVideosNavigation()
	{
		pages.ampLandingPage.verifyMoreVideosLinkNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Videos Section Image Navigation in Homepage
	 */
	@Test
	public void videosImageNavigation()
	{
		pages.ampLandingPage.verifyVideosSectionImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Videos Section Article Text Navigation in Homepage
	 */
	@Test
	public void videosArticleNavigation()
	{
		pages.ampLandingPage.verifyVideosSectionArticleNavigation(this.serverType);
	}
}
