package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image ,News18Showsha Logo and More from News19Showsha Link Navigation 
 * for Education and Career Widget
 */
public class AMPEnglishNews18ShowshaWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The News18Showsha Image Navigation in Homepage
	 */
	@Test
	public void news18ShowshaImageNavigation()
	{
		pages.ampLandingPage.verifyNews18ShowshaImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate News18Showsha Article Text Navigation in Homepage 
	 */
	@Test
	public void news18ShowshaArticleNavigation()
	{
		pages.ampLandingPage.verifyNews18ShowshaArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate News18Showsha Logo Link Navigation in Homepage
	 */
	@Test
	public void news18ShowshaLogoNavigation()
	{
		pages.ampLandingPage.verifyNews18ShowshaLogoNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate More From News18Showsha Link Navigation in Homepage
	 */
	@Test
	public void moreFromNews18ShowshaNavigation()
	{
		pages.ampLandingPage.verifyMoreFromNews18ShowshaLinkNavigation(this.serverType);
	}
}
