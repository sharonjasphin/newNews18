package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Sharon
 *This test class contains the methods to validate the Health and fitness section present at the RHS 
 *of the Home page
 */
public class DesktopHindiHealthAndFitness extends DesktopCommonConfig{

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to verify the Health and fitness section image navigation
	 *  present at the RHS of the Home page
	 */
	@Test
	public void healthAndFitnessHeadlineNavigation() {
		pages.desktopHindiLandingPage.verifyHealthHeadlineNavigation(serverType);

	}
	
	/**
	 * This method is used to verify the Health and fitness article navigation present at
	 * the RHS of the Home page
	 */
	@Test
	public void healthAndFitnessArticleNavigation() {
		pages.desktopHindiLandingPage.verifyHealthArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Health and fitness Read more button navigation
	 * present at the RHS of the Home page
	 */
	@Test
	public void healthReadMore() {
		pages.desktopHindiLandingPage.verifyHealthReadMoreNavigation(serverType);
	}
}
