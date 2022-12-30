package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Photogallery News Link Navigation and Slider Navigation
 * for Photogallery Widget
 */
public class MobileEnglishPhotogalleryWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photogallery Section Article Text Navigation in Homepage
	 */
	@Test
	public void photogalleryArticleNavigation()
	{
		pages.mobileLandingPage.verifyPhotogallerySectionArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photogallery Section Image Navigation in Homepage
	 */
	@Test
	public void photogalleryImageNavigation()
	{
		pages.mobileLandingPage.verifyPhotogallerySectionImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photogallery Slider Navigation for Photogallery Section in Homepage
	 */
	@Test
	public void photogallerySliderNavigation()
	{
		pages.mobileLandingPage.verifyPhotogallerySliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Photogallery News Link navigation for Photogallery Section in Homepage
	 */
	@Test
	public void morePhotogalleryLinkNavigation()
	{
		pages.mobileLandingPage.verifyMorePhotogalleryLnkNavigation(this.serverType);
	}
}

