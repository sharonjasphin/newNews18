package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPEnglishPhotogalleryWidgetTest extends MobileCommonConfig{
	
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	@Test
	public void photogalleryArticleNavigation()
	{
		pages.ampLandingPage.verifyPhotogallerySectionArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photogallery Section Image Navigation in Homepage
	 */
	@Test
	public void photogalleryImageNavigation()
	{
		pages.ampLandingPage.verifyPhotogallerySectionImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photogallery Slider Navigation for Photogallery Section in Homepage
	 */
	@Test
	public void photogallerySliderNavigation()
	{
		pages.ampLandingPage.verifyPhotogallerySliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Photogallery News Link navigation for Photogallery Section in Homepage
	 */
	@Test
	public void morePhotogalleryLinkNavigation()
	{
		pages.ampLandingPage.verifyMorePhotogalleryLnkNavigation(this.serverType);
	}
}
