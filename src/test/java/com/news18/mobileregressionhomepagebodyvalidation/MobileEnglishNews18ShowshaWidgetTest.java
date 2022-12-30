package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More From News18 Showsha Link Navigation 
 * and News18 Showsha Logo Link Navigation for News18 Showsha Widget
 */
public class MobileEnglishNews18ShowshaWidgetTest extends MobileCommonConfig {


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
	 * This method is used to Verify the News18 Showsha Section Article Text Navigation in Homepage
	 */
	@Test
	public void news18ShowshaArticleNavigation()
	{
		pages.mobileLandingPage.verifyNews18ShowshaArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the News18 Showsha Section Image Navigation in Homepage
	 */
	@Test
	public void news18ShowshaImageNavigation()
	{
		pages.mobileLandingPage.verifyNews18ShowshaImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More From News18 Showsha Link Navigation for News18 Showsha Section in Homepage
	 */
	@Test
	public void moreFromNews18ShowshaNavigation()
	{
		pages.mobileLandingPage.verifyMoreFromNews18ShowshaLinkNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the News18 Showsha Logo Navigation for News18 Showsha Section in Homepage
	 */
	@Test
	public void news18ShowshaLogoNavigation()
	{
		pages.mobileLandingPage.verifyNews18ShowshaLogoNavigation(this.serverType);
	}
}
