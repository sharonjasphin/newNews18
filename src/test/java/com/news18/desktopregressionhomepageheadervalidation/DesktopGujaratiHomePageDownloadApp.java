package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiHomePageDownloadApp extends DesktopCommonConfig {
	

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Download App link present in HomePage Header
	 */
	@Test
	public void downloadApp() {
		pages.desktopGujaratiLandingPage.headerDownloadAppValidation();
	}

}
