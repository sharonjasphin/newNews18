package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Header Logo 
 * on Mobile gujarati HomePage.
 * @author DanishR
 */
public class MobileGujaratiHeaderLogoValidationTest extends MobileCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for gujarati
	 * Language URL which is fetching from Property File
	 */
	//	@BeforeMethod
	public void navigateTogujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate Header Logo Navigation Present on Home Page.
	 */
	@Test
	public void headerLogoNavigation () {
		pages.mobileGujaratiLandingPage.headerLogoIcon(serverType);
	}

}
