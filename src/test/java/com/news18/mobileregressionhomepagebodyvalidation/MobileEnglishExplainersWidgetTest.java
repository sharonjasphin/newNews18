package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Explainers News Link Navigation 
 * for Explainers Widget
 */
public class MobileEnglishExplainersWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify the Explainers Section Article Text Navigation in Homepage
	 */
	@Test
	public void explainersArticleNavigation()
	{
		pages.mobileLandingPage.verifyExplainersArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Explainers Section Image Navigation in Homepage
	 */
	@Test
	public void explainersImageNavigation()
	{
		pages.mobileLandingPage.verifyExplainersImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Explainer News Link Navigation for Explainer Section in Homepage
	 */
	@Test
	public void moreExplainersNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreExplainersNewsNavigation(this.serverType);
	}
}
