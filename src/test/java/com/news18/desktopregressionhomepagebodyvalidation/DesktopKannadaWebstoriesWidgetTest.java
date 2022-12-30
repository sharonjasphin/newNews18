package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 *	This class contains Testfiles to Validate the Webstories Widget Article ,Image , Slider and Title Navigation in Homepage
 */
public class DesktopKannadaWebstoriesWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Article Navigation in Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Image Navigation in Homepage
	 */
	@Test
	public void webstoriesImageNavigation()
	{
		pages.desktopKannadaLandingPage.verifyWebstoriesImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Slider in Homepage
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.desktopKannadaLandingPage.verifyWebstoriesSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Title Navigation in Homepage
	 */
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
