package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiAjabGajabWidgetTest extends DesktopCommonConfig {

	
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
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void ajabGajabArticleNavigation()
	{
		pages.desktopHindiLandingPage.verifyAjabGajabArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void ajabGajabImageNavigation()
	{
		pages.desktopHindiLandingPage.verifyAjabGajabImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void ajabGajabReadMoreNavigation()
	{
		pages.desktopHindiLandingPage.verifyAjabGajabReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void ajabGajabTitleNavigation()
	{
		pages.desktopHindiLandingPage.verifyAjabGajabTitleNavigation(serverType);
	}
}
