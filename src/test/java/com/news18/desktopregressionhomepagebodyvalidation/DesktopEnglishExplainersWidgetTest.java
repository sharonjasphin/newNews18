package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Explainers News Link Navigation 
 * for Explainers Widget
 */
public class DesktopEnglishExplainersWidgetTest extends DesktopCommonConfig
{

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

	@Test
	public void explainersArticleNavigation()
	{
		pages.desktopLandingPage.verifyExplainersArticleNavigation(this.serverType);
	}

	@Test
	public void explainersImageNavigation()
	{
		pages.desktopLandingPage.verifyExplainersImageNavigation(this.serverType);
	}

	@Test
	public void explainersMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyExplainersMoreNewsNavigation(this.serverType);
	}
}
