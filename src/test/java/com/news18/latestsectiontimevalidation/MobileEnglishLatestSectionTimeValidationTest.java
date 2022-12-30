package com.news18.latestsectiontimevalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts to verify time difference between Mobile Latest English Section Article's Time with System time and 
 * check whether the difference is less than 15 min by clicking on the Article and fetching the date and time there.
 *
 */
public class MobileEnglishLatestSectionTimeValidationTest extends MobileCommonConfig {

	
	/**
	 * This method is used to navigate to news18 Home Page
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
//	}

	/**
	 * This method is used to navigate to Latest news section and verify the top Story article Updated Time
	 */
	@Test
	public void verifyLatestNewsUpdatedTime()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("latestEnglishUrl"));
		pages.mobileLandingPage.latestSection();
		pages.verifyLatestNewsUpdatedTime.mobileVerifyLatestNewsUpdatedTime(pages.mobileArticleConsumptionPage.getLatestArtcleLnk());
	}
}

