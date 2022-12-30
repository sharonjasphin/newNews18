package com.news18.desktopsanitybodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 *This class contains the method to vaidate the Live blog present in the Home page
 */
public class DesktopGujaratiLiveBlogTest extends DesktopCommonConfig{
	/**
	 * @author 
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * This method is used to validate the Live blog present in the home page
	 */
	@Test
	public void LiveBlogHeadline () {
		pages.desktopGujaratiSanityLandingPage.verfyLiveBlogHeadline(serverType);
	}
}
