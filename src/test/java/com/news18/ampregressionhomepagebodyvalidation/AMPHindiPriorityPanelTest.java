package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *	This class Contains Test Files To validate the Priority panel Article , image and Related News Article 
 * Navigation in Homepage
 */
public class AMPHindiPriorityPanelTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.hindi.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinAmpBeta"));
	}


	@Test
	public void priorityPanelTaazaSamacharArticleNavigation()
	{
		pages.ampHindiLandingPage.verifyTaazaSamacharArticleNavigation(serverType);
	}

	@Test
	public void priorityPanelTaazaSamacharImageNavigation()
	{
		pages.ampHindiLandingPage.verifyTaazaSamacharImageNavigation(serverType);
	}

	@Test
	public void priorityPanelTopHindiNewsArticleNavigation()
	{
		pages.ampHindiLandingPage.verifyTopHindiNewsArticleNavigation(serverType);
	}

	@Test
	public void priorityPanelTopHindiNewsImageNavigation()
	{
		pages.ampHindiLandingPage.verifyTopHindiNewsImageNavigation(serverType);
	}

	@Test
	public void priorityPanelRelatedNewsNavigation()
	{
		pages.ampHindiLandingPage.verifyRelatedNewsArticleNavigation(serverType);
	}
}
