package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 *	This class contains Testfiles to Validate the Topstory Widget Article ,Image , Slider and Title Navigation in Homepage
 */
public class DesktopKannadaTopStoriesWidgetTest extends DesktopCommonConfig {

	
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 *	This method is used to Validate the Topstory Article Navigation in Homepage
	 */
	@Test
	public void topStoriesArticleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTopStoriesArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 *	This method is used to Validate the Topstory Image Navigation in Homepage
	 */
	@Test
	public void topStoriesImageNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTopStoriesImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 *	This method is used to Validate the Topstory Slider Navigation in Homepage
	 */
	@Test
	public void topStoriesSliderNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTopStoriesSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 *	This method is used to Validate the Topstory Title Navigation in Homepage
	 */
	@Test
	public void topStoriesTitleNavigation()
	{
		pages.desktopKannadaLandingPage.verifyTopStoryTitleNavigation(serverType);
	}
}
