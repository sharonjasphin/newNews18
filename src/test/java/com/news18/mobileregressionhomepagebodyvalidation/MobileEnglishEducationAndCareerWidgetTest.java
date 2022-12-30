package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Education and Career News Link Navigation 
 * for Education and Career Widget
 */
public class MobileEnglishEducationAndCareerWidgetTest extends MobileCommonConfig {

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
	 * This method is used to Verify the Education and Career Section Article Text Navigation in Homepage
	 */
	@Test
	public void educationAndCareerArticleNavigation()
	{
		pages.mobileLandingPage.verifyEducationAndCareerArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Education and Career Section Image Navigation in Homepage
	 */
	@Test
	public void educationAndCareerImageNavigation()
	{
		pages.mobileLandingPage.verifyEducationAndCareerImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Education and Career News Link for Education and Career Section in Homepage
	 */
	@Test
	public void moreEducationAndCareerNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreEducationAndCareerNewsNavigation(this.serverType);
	}
	
}
