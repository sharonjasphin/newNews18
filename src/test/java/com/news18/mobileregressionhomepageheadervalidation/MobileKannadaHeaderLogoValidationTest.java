package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Header Logo 
 * on Mobile Kannada HomePage.
 * @author DanishR
 */
public class MobileKannadaHeaderLogoValidationTest extends MobileCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to navigate to News18 Home Page for Kannada
	 * Language URL which is fetching from Property File
	 */
	//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("KannadaUrl"));
	}


	/**
	 * @author DanishR
	 * This method is used to validate Header Logo Navigation Present on Home Page.
	 */
	@Test
	public void headerLogoNavigation () {
		pages.mobileKannadaLandingPage.headerLogoIcon(serverType);
	}

}
