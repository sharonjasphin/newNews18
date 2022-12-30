package com.news18.latestsectiontimevalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


/**
 * @author SanjeebKumarPati
 * This Test Class contains scripts to verify time difference between  Desktop Latest Tamil Section Article's Time with System time and 
 * check whether the difference is less than 15 min by clicking on the Article and fetching the date and time there.
 */
public class DesktopTamilLatestSectionTimeValidationTest extends DesktopCommonConfig {

	
	/**
	 * This method is used to navigate to News18 Home Page for tamil Language URL which is fetching from Property File
	 *  URL-https://tamil.news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
//	}
//	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Latest news section and verify the top Story article Updated Time
	 * 
	 */
	@Test
	public void verifyLatestNewsUpdatedTime()
	{
		pages.desktopTamilLandingPage.latestSection();//It will navigate to latest Section
		//It will Verify the top Stories article updated Time
		pages.verifyLatestNewsUpdatedTime.desktopVerifyLatestNewsUpdatedTime(pages.desktopTamilArticleConsumptionPage.getLatestArtcleLst(), pages.desktopTamilArticleConsumptionPage.getFirstPublishedDate());
	}
	
}
