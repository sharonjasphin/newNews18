package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Rahul
 *This Test class the contains the script to validate the Desktop Todays Panchang Section Read More Button is
 *clickable and navigated to their page
 */
public class DesktopEnglishTodaysPanchang extends DesktopCommonConfig{  
	
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * This method is used to verify the Todays panchang more Button present at the RHS of the Home page
	 */
	@Test
	public void verifyTodaysPanchang() {
		pages.desktopLandingPage.todaysPanchang(serverType);
		
	}

}
