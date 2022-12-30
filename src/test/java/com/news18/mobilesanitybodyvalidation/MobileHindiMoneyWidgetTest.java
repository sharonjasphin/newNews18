package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author 
 * This class contains Test Files to Validate The Article, sections and More News Link Navigation 
 * for Money Widget present on the body part of mobile hindi homepage
 */
public class MobileHindiMoneyWidgetTest extends MobileCommonConfig {


	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Money Section Article Text Navigation in Homepage
	 */
	@Test
	public void moneyWidgetValidation()
	{
		pages.mobileHindiSanityLandingPage.verifyMoneyWidget(serverType);
	}
}