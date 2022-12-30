package com.news18.desktopsanityfootervalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This class contains the method to validate the navigation of footer Network18Sites Navigation
 *
 */
public class DesktopGujaratiNetwork18Validation extends DesktopCommonConfig{

	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for Gujarati Language URL which is fetching from Property File
	 * URL - https://gujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * This method validates the Footer latestNews Navigation In Gujarati Homepage
	 */
	@Test
	public void Network18Sites()
	{
		pages.desktopGujaratiSanityLandingPage.verfyFooterNetwork18Sites(serverType);
	}
}
