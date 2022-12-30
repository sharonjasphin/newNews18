package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Education and Career News Link Navigation 
 * for Education and Career Widget
 */
public class AMPEnglishEducationAndCareerWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify The Education and Career Image Navigation in Homepage
	 */
	@Test
	public void educationAndCareerImageNavigation()
	{
		pages.ampLandingPage.verifyEducationAndCareerImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate Education and Career Section Article Text Navigation in Homepage 
	 */
	@Test
	public void educationAndCareerArticleNavigation()
	{
		pages.ampLandingPage.verifyEducationAndCareerArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Education and Career News Navigation Link in Homepage 
	 */
	@Test
	public void moreEducationAndCareerNewsNavigation()
	{
		pages.ampLandingPage.verifyMoreEducationAndCareerNewsNavigation(this.serverType);
	}
}

