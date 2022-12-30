package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author 
 * This class Contains Test Files for Gujarati Language Priority panel  Section Article Navigation
 */
public class MobileGujaratiPriorityPanelTest extends MobileCommonConfig {

	
	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * @author 
	 * This method validates the Priority Panel Article Navigation In Gujarati Homepage
	 */
	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.mobileGujaratiSanityLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author 
	 * This method validates the Priority Panel Image Navigation In Gujarati Homepage
	 */
	@Test
	public void priorityPanelImageNavigation()
	{
		pages.mobileGujaratiSanityLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}
	
	/**
	 * @author 
	 * This method validates the count of the priority panel article In Gujarati Homepage
	 */
	@Test
	public void priorityPanelArticleCount()
	{
		pages.mobileGujaratiSanityLandingPage.verifyPriorityPanelArticleCount();
	}
}
