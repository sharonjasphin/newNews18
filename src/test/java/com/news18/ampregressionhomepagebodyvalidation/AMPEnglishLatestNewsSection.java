package com.news18.ampregressionhomepagebodyvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author Rahul
 *This Test class contains the script to validate Latest News Section section article present in
 *the AMP Homepage 
 */
public class AMPEnglishLatestNewsSection extends MobileCommonConfig{

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/amp
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("engBeta"));
	}


	/**
	 * This method is used to validate the Latest News Article present in the Amp Homepage
	 */
	@Test
	public void latestNewsArticle() {
		pages.ampLandingPage.verifyLatestNews(serverType);
	}


	/**
	 * This method is used to validate the More Latest News Article present in the Amp Homepage
	 */
	@Test
	public void moreLatestNewsArticle() {
		pages.ampLandingPage.moreLatestNews(serverType);
	}
}

