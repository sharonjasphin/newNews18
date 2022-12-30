package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validates Desktop English HomePage Watch LiveTv
 */
public class DesktopGujaratiHomePageLiveTv extends DesktopCommonConfig {


	/**
	 * This method is used to validate Home Page Header Live TV
	 */
	@Test
	public void headerLiveTv() {
		pages.desktopGujaratiLandingPage.headerliveTVValidation();
	}

}

