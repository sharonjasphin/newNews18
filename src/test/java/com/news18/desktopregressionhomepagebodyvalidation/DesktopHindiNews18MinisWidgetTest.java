package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopHindiNews18MinisWidgetTest extends DesktopCommonConfig{

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	@Test
	public void news18MinisArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
	
	@Test
	public void news18MinisImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18MinisImageNavigation(serverType);
	}
	
	@Test
	public void news18MinisSeeMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18MinisSeeMoreNavigation(serverType);
	}
	
	@Test
	public void news18MinisSliderNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18MinisSliderNavigation();
	}
	
	@Test
	public void news18MinisReadFullStoryNavigation()
	{
		pages.desktopHindiLandingPage.verifyNews18MinisReadFullStoryNavigation(serverType);
	}
	
}
