package com.news18.outbrainvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This test Class contains scripts to verify the OutBrain Contents is displayed/Loading in various pages 
 * like HomePage , Article Consumption Page , LiveBlog Article Consumption Page , PhotoGallery Consumption
 * Page for Assam Language in Desktop Mode 
 */
public class DesktopAssamOutbrainTest extends DesktopCommonConfig {

//	/**
//	 * @author VipinKumarGawande
//	 * This method is used to navigate to News18 HomePage for Assam Language URL which is fetching from Property File
//	 * URL - https://assam.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToAssamHomePageUrl()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
//	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and Image And OutBrain Content 
	 *  is displayed/Loading in News18 HomePage for Assam Language
	 */
	@Test
	public void verifyHomePageOutbrain()
	{
		pages.desktopOutbrainValidation.verifyHomepageOutbrainContent();
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to first Article excluding LiveBlog Article Links in News18 HomePage and 
	 * verify the Promoted Content Ads and OutBrain Content is displayed/Loading in HomePage Article 
	 * Consumption Page
	 */
	@Test
	public void verifyArticleOutbrain()
	{
		pages.desktopAssamLandingPage.clickOnFirstArticleHomePage();		// Click on first Article excluding LiveBlog Articles
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();		
	}
	

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to first Article for only LiveBlog Article Links in News18 HomePage and 
	 * verify the Promoted Content Ads and OutBrain Content is displayed/Loading in HomePage Article 
	 * Consumption Page
	 */
	@Test
	public void verifyLiveblogOutbrain()
	{
		pages.desktopAssamLandingPage.clickOnLiveBlogArticleHomePage();		// Navigate to first Article for only LiveBlog Article
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate Photos section and Click on the first PhotoGallery Article in News18 PhotoGallery Page 
	 * and Verify the Promoted Content Ads and OutBrain Content is displayed/Loading in PhotoGallery Article 
	 * Consumption Page
	 */
	@Test
	public void verifyPhotoGalleryOutbrain()
	{
		pages.desktopAssamLandingPage.clickOnPhotosSection();  								// Click on Photos Section  
		pages.desktopAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();		// Click on First PhotoGallery Article
		pages.desktopOutbrainValidation.verifyArticleOutbarinContent();
	}
}
