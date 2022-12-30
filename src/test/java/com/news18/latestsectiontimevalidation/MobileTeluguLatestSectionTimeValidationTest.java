package com.news18.latestsectiontimevalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts to verify time difference between Mobile Latest Telugu Section Article's Time with System time and 
 * check whether the difference is less than 15 min by clicking on the Article and fetching the date and time there.
 *
 */
public class MobileTeluguLatestSectionTimeValidationTest extends MobileCommonConfig {

	
	/**
	 *This method is used to navigate to News18 Home Page for Telugu Language URL which is fetching from Property File
	 *URL-https://telugu.news18.com/news/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("latestTeluguUrl"));
//	}

	/**
	 * This method is used to navigate to Latest news section and verify the top Story article Updated Time
	 */
	@Test
	public void verifyLatestNewsUpdatedTime()
	{
		pages.mobileTeluguLandingPage.latestSection();// It will click on latest section
		//It will Verify the top Stories article updated Time
		pages.mobileTeluguArticleConsumptionPage.mobileVerifyLatestNewsUpdatedTime();
	}
}

