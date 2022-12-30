package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiPriorityPanelTest extends MobileCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
	//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTaazaSamacharArticleNavigation()
	{
		pages.mobileHindiLandingPage.verifyTaazaSamacharArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTaazaSamacharImageNavigation()
	{
		pages.mobileHindiLandingPage.verifyTaazaSamacharImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTopHindiNewsArticleNavigation()
	{
		pages.mobileHindiLandingPage.verifyTopHindiNewsArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTopHindiNewsImageNavigation()
	{
		pages.mobileHindiLandingPage.verifyTopHindiNewsImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelRelatedNewsNavigation()
	{
		pages.mobileHindiLandingPage.verifyRelatedNewsArticleNavigation(serverType);
	}
}
