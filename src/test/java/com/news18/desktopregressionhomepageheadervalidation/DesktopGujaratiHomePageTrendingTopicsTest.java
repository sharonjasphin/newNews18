package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiHomePageTrendingTopicsTest extends DesktopCommonConfig {
	

	/**
	 * This method is used to validate Trending Topics Home Page Header
	 */
	@Test
	public void headerTrendingTopics() {
		
		pages.desktopGujaratiLandingPage.verifyTrendingTopics(serverType);
	}

}
