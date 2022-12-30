package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Rahul
 *This Test class contains the script to validate the Desktop Air Quality Index  Section widgets are clickable 
 *and navigated to their pages
 */
public class DesktopEnglishAirQualityIndex extends DesktopCommonConfig{ 
	
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	 
	/**
	 * This method is used to verify the Air Quality Index widgets present at the RHS of the Home page
	 */
	@Test
	public void verifyAirQualityIndex() {
		pages.desktopLandingPage.airQualityIndex(serverType);
	}
}

