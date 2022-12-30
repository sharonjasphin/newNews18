package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validates Desktop Kannada HomePage Watch LiveTv
 */
public class DesktopKannadaHomePageLiveTv extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Kannada News18 Home Page URL which is fetched from Property File
	 * URL-https://betakannada.news18.com/
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("KannadaBeta"));
	}

	/**
	 * This method is used to validate Home Page Header Live TV
	 */
	@Test
	public void headerLiveTv() {
		pages.desktopKannadaLandingPage.verifyHeaderLiveTv(serverType);
	}

}

