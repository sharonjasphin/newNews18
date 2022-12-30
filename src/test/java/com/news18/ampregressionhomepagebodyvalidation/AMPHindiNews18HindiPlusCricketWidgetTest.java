package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image , See More Link Navigation and Slider Navigation
 * for News 18 Hindi Plus Widget
 */
public class AMPHindiNews18HindiPlusCricketWidgetTest extends MobileCommonConfig  {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://www.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampHindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the News 18 Hindi Plus Section Article Text Navigation in Homepage
	 */
	@Test
	public void news18HindiPlusCricketArticleNavigation()
	{
		pages.ampHindiLandingPage.verifyNews18PlusCricketArticleNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the See More Link Navigation for news18HindiPlus Section in Homepage
	 */
	@Test
	public void news18HindiPlusCricketSeeMoreLinkValidation()
	{
		pages.ampHindiLandingPage.verifyNews18PlusCricketReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the See More Link Navigation for news18HindiPlus Section in Homepage
	 */
	@Test
	public void verifyNews18PlusTitleNavigation()
	{
		pages.ampHindiLandingPage.verifyNews18HindiPlusBannerNavigation();
	}
}