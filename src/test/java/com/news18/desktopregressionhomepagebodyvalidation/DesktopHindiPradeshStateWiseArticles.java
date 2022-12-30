package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class contains Test Files to Validate Pradesh News in Hindi HomePage Body
 * for Pradesh News Widget
 */
public class DesktopHindiPradeshStateWiseArticles extends DesktopCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to Verify Pradesh News State Wise Articles Navigation
	 */
	@Test
	public void pradeshNewsArticlesNavigation()
	{
		pages.desktopHindiLandingPage.pradeshNewsStatesWiseArticles(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to Verify Pradesh News State Wise Articles More News Navigation
	 */
	@Test
	public void pradeshNewsStatesArticleMoreNews()
	{
		pages.desktopHindiLandingPage.pradeshNewsStatesArticleMoreNews(serverType);
	}
}
