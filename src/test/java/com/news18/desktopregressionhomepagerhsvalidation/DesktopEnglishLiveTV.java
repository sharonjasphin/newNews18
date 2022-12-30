package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Rahul
 *This Test class contains the script to validate the functionalities of the Live Tv section of Desktop
 *present at the RHS of the Home page
 */
public class DesktopEnglishLiveTV extends DesktopCommonConfig{ 

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * This method is used to verify the functionalities of the Live Tv Section present 
	 * at the RHS of the Home page
	 * @throws InterruptedException
	 */
	@Test
	public void verifyLiveTv() throws InterruptedException {
		pages.desktopLandingPage.liveTv();
		
	}
}
