package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopLokmatNews18MinisWidgetTest extends DesktopCommonConfig{

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void news18MinisArticleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
	
	@Test
	public void news18MinisImageNavigation()
	{
		pages.desktopLokmatLandingPage.verifyNews18MinisImageNavigation(serverType);
	}
	
	@Test
	public void news18MinisSeeMoreNavigation()
	{
		pages.desktopLokmatLandingPage.verifyNews18MinisSeeMoreNavigation(serverType);
	}
	
	@Test
	public void news18MinisSliderNavigation()
	{
		pages.desktopLokmatLandingPage.verifyNews18MinisSliderNavigation();
	}
	
	@Test
	public void news18MinisReadFullStoryNavigation()
	{
		pages.desktopLokmatLandingPage.verifyNews18MinisReadFullStoryNavigation(serverType);
	}
	
	@Test
	public void news18MinisNews18MoreStoriesNavigation()
	{
		pages.desktopLokmatLandingPage.verifyNews18MinisNews18MoreStories(serverType);
	}
	
}
