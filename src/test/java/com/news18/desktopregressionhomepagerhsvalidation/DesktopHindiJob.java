package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Naukri section navigation present at the RHS 
 *of the Home page
 */
public class DesktopHindiJob extends DesktopCommonConfig{

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to verify the Naukri section title navigation present at the RHS of the Home page
	 */
	@Test
	public void JobTitleNavigation() {
		pages.desktopHindiLandingPage.verifyJobTitle(serverType);

	}
	
	/**
	 * This method is used to verify the Naukri section image navigation present the RHS of the Home page
	 */
	@Test
	public void jobImageNavigation() {
		pages.desktopHindiLandingPage.verifyJobImageNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Naukri section article navigation present at the
	 * RHS of the Home page
	 */
	@Test
	public void jobArticleNavigation() {
		pages.desktopHindiLandingPage.verifyJobArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Naukri section Read more Button navigation present
	 * at the RHS of the Home page
	 */
	@Test
	public void jobReadMoreNavigation() {
		pages.desktopHindiLandingPage.verifyjobReadMoreNavigation(serverType);
	}
}
