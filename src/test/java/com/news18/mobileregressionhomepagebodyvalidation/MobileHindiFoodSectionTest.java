package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Food section articles navogation
 *present at the RHS of the Home page
 */
public class MobileHindiFoodSectionTest extends MobileCommonConfig{
	
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * This method is used to verify the Food title navigation present in the Home page
	 */
	@Test
	public void foodSectionHeadline() {
		pages.mobileHindiLandingPage.verifyFoodSectionHeadline(serverType);
	}
	
	/**
	 * This method is used to verify the Food article navigation present in the HindiHome page 
	 */
	@Test
	public void foodArticleNavigation() {
		pages.mobileHindiLandingPage.verifyFoodArticleNavigation(serverType);
	}
	
	/**
	 * This method is to verify the food ReadMore navigation present in the Hindi Home Page
	 */
	@Test
	public void foodReadMore() {
		pages.mobileHindiLandingPage.verifyFoodReadMore(serverType);
	}
	
	
}
