package com.news18.mobileregressionhomepagebodyvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author Rahul
 *This Test class contains the script to validate the Mobile latest news Section articles are clickable and navigated to
 *their pages
 */
public class MobileEnglishLatestNews extends MobileCommonConfig{

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * This method is used to verify the latest news articles present in the Home page of Mobile view
	 */
	@Test
	public void verifyLatestNewsArticle() {
		pages.mobileLandingPage.latestNewsArcticle(serverType);
	}

	/**
	 * This method is used to verify the more latest news articles present in the Home page of Mobile view
	 */
	@Test
	public void viewMoreLatestNews() {
		pages.mobileLandingPage.viewMoreLatestNews(serverType);
	}
}
