package com.news18.latestsectiontimevalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


/**
 *@author SanjeebKumarPati
 * This Test Class contains scripts to verify time difference between Desktop Latest Bengali Section Article's Time with System time and 
 * check whether the difference is less than 15 min by clicking on the Article and fetching the date and time there. 
 */
public class DesktopBengaliLatestSectionTimeValidationTest extends DesktopCommonConfig {

	
	/**
	 * This method is used to navigate to News18 Home Page for bengali Language URL which is fetching from Property File
	 *  URL-https://bengali.news18.com/news/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("latestBengaliUrl"));
//	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Latest news section and verify the top Story article Updated Time
	 * 
	 */
	@Test
	public void verifyLatestNewsUpdatedTime()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("latestBengaliUrl"));
		//It will Verify the top Stories article updated Time
		pages.verifyLatestNewsUpdatedTime.desktopVerifyLatestNewsUpdatedTime(pages.desktopBengaliArticleConsumptionPage.getLatestArtcleLst(), pages.desktopBengaliArticleConsumptionPage.getFirstPublishedDate());
	}
	
}
