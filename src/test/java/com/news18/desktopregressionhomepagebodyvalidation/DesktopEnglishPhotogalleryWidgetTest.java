package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and Left and Right Arrow Button Navigation 
 * for Photogallery Widget
 */
public class DesktopEnglishPhotogalleryWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to Verify The PhotoGallery Widget Left And Right Arrow Navigation
	 */
	@Test
	public void photogalleryRightSliderNavigation()
	{
		pages.desktopLandingPage.verifyPhotogalleryRightSliderNavigation();
	}
	
	@Test
	public void photogalleryLeftSliderNavigation()
	{
		pages.desktopLandingPage.verifyPhotogalleryLeftSliderNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The PhotoGallery Widget Article Text Navigation
	 */
	@Test
	public void photogalleryArticleNavigation()
	{
		pages.desktopLandingPage.verifyPhotogalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The PhotoGallery Widget Image Navigation
	 */
	@Test
	public void photogalleryImageNavigation()
	{
		pages.desktopLandingPage.verifyPhotogalleryImageNavigation(serverType);
	}

}