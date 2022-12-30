package com.news18.mobilesanitybodyvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author 
 * This class contains Test Files to Validate Pradesh News in Hindi HomePage Body 
 * for Pradesh News Widget
 */
public class MobileHindiPradeshStateWiseArticles extends MobileCommonConfig{

	/**
	 * @author 
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	/**
	 * @author 
	 * This method is used to Verify Pradesh News State Wise Articles Navigation
	 */
	@Test
	public void pradeshNewsArticlesNavigation()
	{
		pages.mobileHindiSanityLandingPage.pradeshNewsStatesWiseArticles(serverType);
	}	
}
